package de.oklab.leipzig.oparl.converter;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import de.oklab.leipzig.oparl.entities.Body;
import de.oklab.leipzig.oparl.persistence.OParlRepository;
import de.oklab.leipzig.oparl.service.model.AgendaItem;

@Component
public class AgendaItemConverter implements Converter<AgendaItem, de.oklab.leipzig.oparl.entities.AgendaItem> {

    @Autowired
    private OParlRepository oParlRepository;

    private Map<URI, de.oklab.leipzig.oparl.entities.Body> bodies = new HashMap<>();

    @Override
    public de.oklab.leipzig.oparl.entities.AgendaItem convert(AgendaItem source) {
        de.oklab.leipzig.oparl.entities.AgendaItem entity = new de.oklab.leipzig.oparl.entities.AgendaItem();
        entity.setCreated(source.getCreated());
        entity.setModified(source.getModified());
        entity.setPolitikBeiUnsOriginalId(source.getOriginalId());
        entity.setOriginalId(source.getId());
        entity.setWasPublic(source.isWasPublic());
        URI bodyURI = source.getBody();
        Body body = null;
        if (!bodies.containsKey(bodyURI)) {
            body = oParlRepository.findBodyByURI(bodyURI);
            bodies.put(bodyURI, body);
        } else {
            body = bodies.get(bodyURI);
        }
        entity.setBody(body);
        return entity;
    }
}
