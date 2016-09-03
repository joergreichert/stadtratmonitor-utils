package de.oklab.leipzig.oparl.converter;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import de.oklab.leipzig.oparl.entities.Body;
import de.oklab.leipzig.oparl.persistence.BodyRepository;
import de.oklab.leipzig.oparl.service.model.Meeting;

@Component
public class MeetingConverter implements Converter<Meeting, de.oklab.leipzig.oparl.entities.Meeting> {
    @Autowired
    private BodyRepository bodyRepository;

    @Autowired
    private AgendaItemConverter agendaItemConverter;

    private Map<URI, de.oklab.leipzig.oparl.entities.Body> bodies = new HashMap<>();

    @Override
    public de.oklab.leipzig.oparl.entities.Meeting convert(Meeting source) {
        de.oklab.leipzig.oparl.entities.Meeting entity = new de.oklab.leipzig.oparl.entities.Meeting();
        entity.setCreated(source.getCreated());
        entity.setModified(source.getModified());
        entity.setAddress(source.getAddress());
        entity.setDescription(source.getDescription());
        entity.setEnd(source.getEnd());
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
        entity.setAgendaItem(
                source.getAgendaItem().stream().map(a -> agendaItemConverter.convert(a)).collect(Collectors.toList()));
        return entity;
    }
}