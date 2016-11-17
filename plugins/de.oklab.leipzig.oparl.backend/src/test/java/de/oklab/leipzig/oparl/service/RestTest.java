package de.oklab.leipzig.oparl.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.stream.Collectors;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.oklab.leipzig.oparl.service.model.AgendaItem;
import de.oklab.leipzig.oparl.service.model.Body;
import de.oklab.leipzig.oparl.service.model.BodyResult;
import de.oklab.leipzig.oparl.service.model.MeetingResult;
import de.oklab.leipzig.oparl.service.model.Organization;
import de.oklab.leipzig.oparl.service.model.OrganizationResult;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class RestTest {

    @BeforeClass
    public static void beforeClass() throws Exception {
        TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
            @Override
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            @Override
            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        } };
        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        HostnameVerifier allHostsValid = new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
    }

    @Test
    @Ignore
    public void testDownload() throws IOException {
        downloadFile(URI.create("https://politik-bei-uns.de/oparl/body"));
    }

    @Test
    @Ignore
    public void testParseBodyFromRest() throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        BodyResult result = restTemplate.getForObject(URI.create("https://politik-bei-uns.de/oparl/body"),
                BodyResult.class);
        for (Body data : result.getData()) {
            System.out.println(data);
        }
    }

    private void downloadFile(URI uri) throws IOException, MalformedURLException {
        try (InputStream in = uri.toURL().openStream()) {
            Files.copy(in, Paths.get(new File(uri.toURL().getPath()).getName() + ".json"),
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioe) {
            System.err.println("Failed to download: " + uri);
        }
    }

    @Test
    @Ignore
    public void testParseBodyFromFile() throws IOException {
        BodyResult result = new ObjectMapper().readerFor(BodyResult.class).readValue(new File("body.json"));
        System.out.println(result);

        for (Body data : result.getData()) {
            downloadFile(data.getSystem());
            downloadFile(data.getMeeting());
            downloadFile(data.getPerson());
            downloadFile(data.getPaper());
            downloadFile(data.getOrganization());
        }
    }

    @Test
    @Ignore
    public void testParseOrganizationFromFile() throws IOException {
        OrganizationResult result = new ObjectMapper().readerFor(OrganizationResult.class)
                .readValue(new File("organization.json"));
        for (Organization org : result.getData()) {
            for (URI member : org.getMembership()) {
                downloadFile(member);
            }
        }

        for (URI data : result.getData().stream().flatMap(d -> d.getMembership().stream())
                .collect(Collectors.toList())) {
            downloadFile(data);
        }
    }

    @Test
    @Ignore
    public void testDownloadConsultation() throws JsonProcessingException, IOException {
        MeetingResult result = new ObjectMapper().readerFor(MeetingResult.class).readValue(new File("meeting.json"));
        for (de.oklab.leipzig.oparl.service.model.Meeting meeting : result.getData()) {
            for (AgendaItem agendaItem : meeting.getAgendaItem()) {
                if (agendaItem.getConsultation() != null) {
                    downloadFile(agendaItem.getConsultation());
                }
            }
        }
    }

    @Test
    @Ignore
    public void testDownloadPerson() throws JsonProcessingException, IOException {
        List<de.oklab.leipzig.oparl.service.model.Membership> results = Files.list(Paths.get("data/memberships"))
                .map(file -> toResult(file)).filter(e -> e != null).collect(Collectors.toList());
        for (de.oklab.leipzig.oparl.service.model.Membership result : results) {
            downloadFile(result.getPerson());
        }
    }

    private de.oklab.leipzig.oparl.service.model.Membership toResult(Path file) {
        try {
            return new ObjectMapper().readerFor(de.oklab.leipzig.oparl.service.model.Membership.class)
                    .readValue(file.toFile());
        } catch (Exception e) {
            return null;
        }
    }
}
