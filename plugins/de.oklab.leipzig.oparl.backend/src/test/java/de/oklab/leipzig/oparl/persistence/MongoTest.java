package de.oklab.leipzig.oparl.persistence;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;

import de.oklab.leipzig.oparl.converter.SystemConverter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SystemConverter.class })
public class MongoTest {
    private Datastore datastore;

    @Before
    public void setUp() {
        final Morphia morphia = new Morphia();
        morphia.mapPackage("de.oklab.leipzig.oparl.entities");
        datastore = morphia.createDatastore(new MongoClient(), "oklab_protobuf");
        datastore.ensureIndexes();
    }

    @Autowired
    private SystemConverter systemConverter;

    @Test
    @Ignore
    public void testSaveSystem() throws JsonProcessingException, IOException {
        de.oklab.leipzig.oparl.service.model.System system = new ObjectMapper()
                .readerFor(de.oklab.leipzig.oparl.service.model.System.class).readValue(new File("data/oparl.json"));
        de.oklab.leipzig.oparl.def.Oparl.System entity = systemConverter.convert(system);
        datastore.save(entity);
    }

}
