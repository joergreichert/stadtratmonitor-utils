package de.oklab.leipzig.oparl.converter;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import de.oklab.leipzig.oparl.entities.Body;
import de.oklab.leipzig.oparl.persistence.OParlRepository;
import de.oklab.leipzig.oparl.service.model.Person;

@Component
public class PersonConverter implements Converter<Person, de.oklab.leipzig.oparl.entities.Person> {

    @Autowired
    private OParlRepository oParlRepository;

    private Map<URI, de.oklab.leipzig.oparl.entities.Body> bodies = new HashMap<>();

    @Override
    public de.oklab.leipzig.oparl.entities.Person convert(Person source) {
        de.oklab.leipzig.oparl.entities.Person entity = new de.oklab.leipzig.oparl.entities.Person();
        entity.setCreated(source.getCreated());
        entity.setModified(source.getModified());
        entity.setPolitikBeiUnsOriginalId(source.getOriginalId());
        URI bodyURI = source.getBody();
        Body body = null;
        if (!bodies.containsKey(bodyURI)) {
            body = oParlRepository.findBodyByURI(bodyURI);
            bodies.put(bodyURI, body);
        } else {
            body = bodies.get(bodyURI);
        }
        entity.setBody(body);
        entity.setAddress(null);
        entity.setEmail(null);
        entity.setFax(null);
        entity.setHouseNumber(null);
        if (source.getName() != null) {
            int wsIndex = source.getName().indexOf(" ");
            if (wsIndex > 0) {
                entity.setFirstname(source.getName().substring(0, wsIndex));
                entity.setLastname(source.getName().substring(wsIndex + 1));
            } else {
                entity.setLastname(source.getName());
            }
        }
        entity.setMembership(null);
        entity.setMobile(null);
        entity.setOriginalId(source.getId());
        entity.setOriginalUrl(null);
        entity.setPhone(null);
        entity.setPostalcode(null);
        entity.setSex(null);
        entity.setTitle(null);
        entity.setOriginalId(source.getId());
        return entity;
    }
}
