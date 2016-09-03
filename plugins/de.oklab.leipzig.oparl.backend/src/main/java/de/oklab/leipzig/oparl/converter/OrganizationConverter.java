package de.oklab.leipzig.oparl.converter;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import de.oklab.leipzig.oparl.entities.Body;
import de.oklab.leipzig.oparl.persistence.BodyRepository;
import de.oklab.leipzig.oparl.service.model.Organization;

@Component
public class OrganizationConverter implements Converter<Organization, de.oklab.leipzig.oparl.entities.Organization> {
    @Autowired
    private BodyRepository bodyRepository;

    private Map<URI, de.oklab.leipzig.oparl.entities.Body> bodies = new HashMap<>();

    @Override
    public de.oklab.leipzig.oparl.entities.Organization convert(Organization source) {
        de.oklab.leipzig.oparl.entities.Organization entity = new de.oklab.leipzig.oparl.entities.Organization();
        entity.setCreated(source.getCreated());
        entity.setModified(source.getModified());
        entity.setName(source.getName());
        entity.setOriginalId(source.getId());
        entity.setPolitikBeiUnsOriginalId(source.getOriginalId());
        URI bodyURI = source.getBody();
        Body body = null;
        if (!bodies.containsKey(bodyURI)) {
            body = bodyRepository.findOne(bodyURI);
            bodies.put(bodyURI, body);
        } else {
            body = bodies.get(bodyURI);
        }
        entity.setBody(body);
        return entity;
    }
}
