package de.oklab.leipzig.oparl.persistence;

import static com.lordofthejars.nosqlunit.mongodb.MongoDbConfigurationBuilder.mongoDb;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lordofthejars.nosqlunit.mongodb.MongoDbRule;

import de.oklab.leipzig.oparl.converter.AgendaItemConverter;
import de.oklab.leipzig.oparl.converter.BodyConverter;
import de.oklab.leipzig.oparl.converter.ConsultationConverter;
import de.oklab.leipzig.oparl.converter.FileConverter;
import de.oklab.leipzig.oparl.converter.MeetingConverter;
import de.oklab.leipzig.oparl.converter.MembershipConverter;
import de.oklab.leipzig.oparl.converter.OrganizationConverter;
import de.oklab.leipzig.oparl.converter.PersonConverter;
import de.oklab.leipzig.oparl.converter.SystemConverter;
import de.oklab.leipzig.oparl.entities.Body;
import de.oklab.leipzig.oparl.entities.Consultation;
import de.oklab.leipzig.oparl.entities.Meeting;
import de.oklab.leipzig.oparl.entities.Membership;
import de.oklab.leipzig.oparl.entities.Organization;
import de.oklab.leipzig.oparl.entities.Person;
import de.oklab.leipzig.oparl.persistence.impl.OParlRepositoryImpl;
import de.oklab.leipzig.oparl.service.model.BodyResult;
import de.oklab.leipzig.oparl.service.model.MeetingResult;
import de.oklab.leipzig.oparl.service.model.OrganizationResult;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringMongoConfiguration.class, OParlRepositoryImpl.class, SystemConverter.class,
        BodyConverter.class, OrganizationConverter.class, MeetingConverter.class, MembershipConverter.class,
        AgendaItemConverter.class, ConsultationConverter.class, FileConverter.class, PersonConverter.class })
public class MongoTest {
    @Rule
    public MongoDbRule remoteMongoDbRule = new MongoDbRule(mongoDb().databaseName("oklab").host("localhost").build());

    @Autowired
    private SystemRepository systemRepository;

    @Autowired
    private BodyRepository bodyRepository;

    @Autowired
    private OrganizationRepository organizationRepository;

    @Autowired
    private MeetingRepository meetingRepository;

    @Autowired
    private AgendaItemRepository agendaItemRepository;

    @Autowired
    private MembershipRepository membershipRepository;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private FileRepository fileRepository;

    @Autowired
    private SystemConverter systemConverter;

    @Autowired
    private BodyConverter bodyConverter;

    @Autowired
    private OrganizationConverter organizationConverter;

    @Autowired
    private MeetingConverter meetingConverter;

    @Autowired
    private MembershipConverter membershipConverter;

    @Autowired
    private ConsultationRepository consultationRepository;

    @Autowired
    private ConsultationConverter consultationConverter;

    @Autowired
    private PersonConverter personConverter;

    @Test
    @Ignore
    public void testSaveSystem() throws JsonProcessingException, IOException {
        de.oklab.leipzig.oparl.service.model.System system = new ObjectMapper()
                .readerFor(de.oklab.leipzig.oparl.service.model.System.class).readValue(new File("data/oparl.json"));
        de.oklab.leipzig.oparl.entities.System entity = systemConverter.convert(system);
        systemRepository.save(entity);
    }

    @Test
    @Ignore
    public void testSaveBody() throws JsonProcessingException, IOException {
        BodyResult result = new ObjectMapper().readerFor(BodyResult.class).readValue(new File("data/body.json"));
        List<Body> entities = result.getData().stream().parallel().map(b -> bodyConverter.convert(b))
                .collect(Collectors.toList());
        bodyRepository.saveAll(entities);
    }

    @Test
    @Ignore
    public void testUpdateSystemWithBodies() throws JsonProcessingException, IOException {
        List<Body> bodies = bodyRepository.findAll();
        List<de.oklab.leipzig.oparl.entities.System> systems = systemRepository.findAll();
        for (de.oklab.leipzig.oparl.entities.System system : systems) {
            system.setBody(bodies);
        }
        systemRepository.saveAll(systems);
    }

    @Test
    @Ignore
    public void testSaveOrganization() throws JsonProcessingException, IOException {
        OrganizationResult result = new ObjectMapper().readerFor(OrganizationResult.class)
                .readValue(new File("data/organization.json"));
        List<Organization> entities = result.getData().stream().parallel().map(b -> organizationConverter.convert(b))
                .collect(Collectors.toList());
        organizationRepository.saveAll(entities);
    }

    @Test
    @Ignore
    public void testSaveMeeting() throws JsonProcessingException, IOException {
        MeetingResult result = new ObjectMapper().readerFor(MeetingResult.class)
                .readValue(new File("data/meeting.json"));
        navigateMeetings(result);
    }

    private void navigateMeetings(MeetingResult result)
            throws JsonProcessingException, MalformedURLException, IOException {
        List<Meeting> entities = result.getData().stream().parallel().map(b -> meetingConverter.convert(b))
                .collect(Collectors.toList());
        Map<Body, List<Meeting>> bodyToMeeting = new HashMap<>();
        for (Meeting entity : entities) {
            agendaItemRepository.saveAll(entity.getAgendaItem());
            if (bodyToMeeting.containsKey(entity.getBody())) {
                bodyToMeeting.get(entity.getBody()).add(entity);
            } else {
                List<Meeting> meetings = new ArrayList<>();
                meetings.add(entity);
                if (entity.getBody() != null) {
                    bodyToMeeting.put(entity.getBody(), meetings);
                }
            }
        }
        meetingRepository.saveAll(entities);
        for (Map.Entry<Body, List<Meeting>> entry : bodyToMeeting.entrySet()) {
            entry.getKey().setMeeting(entry.getValue());
        }
        bodyRepository.saveAll(bodyToMeeting.keySet());
        if (result.getLinks() != null) {
            URI next = result.getLinks().getNext();
            if (next != null) {
                MeetingResult nextResult = new ObjectMapper().readerFor(MeetingResult.class).readValue(next.toURL());
                navigateMeetings(nextResult);
            }
        }
    }

    @Test
    @Ignore
    public void testSaveMembership() throws JsonProcessingException, IOException {
        List<Membership> entities = Files.list(Paths.get("data/memberships")).map(file -> processMembershipFile(file))
                .filter(e -> e != null).collect(Collectors.toList());
        membershipRepository.saveAll(entities);
    }

    private Membership processMembershipFile(Path file) {
        try {
            de.oklab.leipzig.oparl.service.model.Membership result = new ObjectMapper()
                    .readerFor(de.oklab.leipzig.oparl.service.model.Membership.class).readValue(file.toFile());
            return membershipConverter.convert(result);
        } catch (IOException e) {
            System.err.println(file + " cannot be processed: " + e.getMessage());
            // e.printStackTrace();
            return null;
        }
    }

    @Test
    @Ignore
    public void testConsultation() throws JsonProcessingException, IOException {
        Files.list(Paths.get("data/consultation")).map(file -> processConsultationFile(file)).filter(e -> e != null)
                .parallel().forEach(entity -> consultationRepository.save(entity));
    }

    private Consultation processConsultationFile(Path file) {
        try {
            de.oklab.leipzig.oparl.service.model.Consultation result = new ObjectMapper()
                    .readerFor(de.oklab.leipzig.oparl.service.model.Consultation.class).readValue(file.toFile());
            return consultationConverter.convert(result);
        } catch (IOException e) {
            System.err.println(file + " cannot be processed: " + e.getMessage());
            // e.printStackTrace();
            return null;
        }
    }

    @Test
    @Ignore
    public void testFile() throws JsonProcessingException, IOException {
        MeetingResult result = new ObjectMapper().readerFor(MeetingResult.class).readValue(new File("meeting.json"));
        List<Meeting> entities = result.getData().stream().parallel().map(b -> meetingConverter.convert(b))
                .collect(Collectors.toList());
        Meeting existingMeeting = null;
        List<Meeting> existingMeetings = meetingRepository.findAll();
        for (Meeting entity : entities) {
            for (Meeting meeting : existingMeetings) {
                if (meeting.getOriginalId() != null && entity.getOriginalId() != null
                        && meeting.getOriginalId().toString().equals(entity.getOriginalId().toString())) {
                    existingMeeting = meeting;
                    break;
                }
            }
            if (entity.getAuxiliaryFile() != null) {
                for (de.oklab.leipzig.oparl.entities.File auxiliaryFile : entity.getAuxiliaryFile()) {
                    fileRepository.save(auxiliaryFile);
                    if (existingMeeting != null) {
                        if (existingMeeting.getAuxiliaryFile() == null) {
                            existingMeeting.setAuxiliaryFile(new ArrayList<>());
                        }
                        existingMeeting.getAuxiliaryFile().add(auxiliaryFile);
                    }
                }
            }
            if (entity.getInvitation() != null) {
                fileRepository.save(entity.getInvitation());
                if (existingMeeting != null) {
                    existingMeeting.setInvitation(entity.getInvitation());
                }
            }
            if (entity.getResultsProtocol() != null) {
                fileRepository.save(entity.getResultsProtocol());
                if (existingMeeting != null) {
                    existingMeeting.setResultsProtocol(entity.getResultsProtocol());
                }
            }
            if (existingMeeting != null) {
                meetingRepository.save(existingMeeting);
            } else if (entity != null) {
                meetingRepository.save(entity);
            }
        }
    }

    @Test
    @Ignore
    public void testPerson() throws JsonProcessingException, IOException {
        Files.list(Paths.get("data/person")).map(file -> processPersonFile(file)).filter(e -> e != null).parallel()
                .forEach(entity -> personRepository.save(entity));
    }

    private Person processPersonFile(Path file) {
        try {
            de.oklab.leipzig.oparl.service.model.Person result = new ObjectMapper()
                    .readerFor(de.oklab.leipzig.oparl.service.model.Person.class).readValue(file.toFile());
            return personConverter.convert(result);
        } catch (IOException e) {
            System.err.println(file + " cannot be processed: " + e.getMessage());
            // e.printStackTrace();
            return null;
        }
    }
}
