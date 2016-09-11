package de.oklab.leipzig.oparl.persistence;

import static com.lordofthejars.nosqlunit.mongodb.MongoDbConfigurationBuilder.mongoDb;

import java.io.File;
import java.io.IOException;
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
import de.oklab.leipzig.oparl.converter.MeetingConverter;
import de.oklab.leipzig.oparl.converter.OrganizationConverter;
import de.oklab.leipzig.oparl.converter.SystemConverter;
import de.oklab.leipzig.oparl.entities.Body;
import de.oklab.leipzig.oparl.entities.Meeting;
import de.oklab.leipzig.oparl.entities.Organization;
import de.oklab.leipzig.oparl.persistence.impl.OParlRepositoryImpl;
import de.oklab.leipzig.oparl.service.model.BodyResult;
import de.oklab.leipzig.oparl.service.model.MeetingResult;
import de.oklab.leipzig.oparl.service.model.OrganizationResult;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringMongoConfiguration.class, OParlRepositoryImpl.class, SystemConverter.class,
        BodyConverter.class, OrganizationConverter.class, MeetingConverter.class, AgendaItemConverter.class })
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
    private SystemConverter systemConverter;

    @Autowired
    private BodyConverter bodyConverter;

    @Autowired
    private OrganizationConverter organizationConverter;

    @Autowired
    private MeetingConverter meetingConverter;

    @Test
    @Ignore
    public void testSaveSystem() throws JsonProcessingException, IOException {
        de.oklab.leipzig.oparl.service.model.System system = new ObjectMapper()
                .readerFor(de.oklab.leipzig.oparl.service.model.System.class).readValue(new File("oparl.json"));
        de.oklab.leipzig.oparl.entities.System entity = systemConverter.convert(system);
        systemRepository.save(entity);
    }

    @Test
    @Ignore
    public void testSaveBody() throws JsonProcessingException, IOException {
        BodyResult result = new ObjectMapper().readerFor(BodyResult.class).readValue(new File("body.json"));
        List<Body> entities = result.getData().stream().parallel().map(b -> bodyConverter.convert(b))
                .collect(Collectors.toList());
        bodyRepository.save(entities);
    }

    @Test
    @Ignore
    public void testUpdateSystemWithBodies() throws JsonProcessingException, IOException {
        List<Body> bodies = bodyRepository.findAll();
        List<de.oklab.leipzig.oparl.entities.System> systems = systemRepository.findAll();
        for (de.oklab.leipzig.oparl.entities.System system : systems) {
            system.setBody(bodies);
        }
        systemRepository.save(systems);
    }

    @Test
    @Ignore
    public void testSaveOrganization() throws JsonProcessingException, IOException {
        OrganizationResult result = new ObjectMapper().readerFor(OrganizationResult.class)
                .readValue(new File("organization.json"));
        List<Organization> entities = result.getData().stream().parallel().map(b -> organizationConverter.convert(b))
                .collect(Collectors.toList());
        organizationRepository.save(entities);
    }

    @Test
    @Ignore
    public void testSaveMeeting() throws JsonProcessingException, IOException {
        MeetingResult result = new ObjectMapper().readerFor(MeetingResult.class).readValue(new File("meeting.json"));
        List<Meeting> entities = result.getData().stream().parallel().map(b -> meetingConverter.convert(b))
                .collect(Collectors.toList());
        Map<Body, List<Meeting>> bodyToMeeting = new HashMap<>();
        for (Meeting entity : entities) {
            agendaItemRepository.save(entity.getAgendaItem());
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
        meetingRepository.save(entities);
        for (Map.Entry<Body, List<Meeting>> entry : bodyToMeeting.entrySet()) {
            entry.getKey().setMeeting(entry.getValue());
        }
        bodyRepository.save(bodyToMeeting.keySet());
    }
}
