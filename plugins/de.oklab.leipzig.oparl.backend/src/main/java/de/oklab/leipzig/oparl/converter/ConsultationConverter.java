package de.oklab.leipzig.oparl.converter;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import de.oklab.leipzig.oparl.entities.AgendaItem;
import de.oklab.leipzig.oparl.entities.Body;
import de.oklab.leipzig.oparl.persistence.OParlRepository;
import de.oklab.leipzig.oparl.service.model.Consultation;

@Component
public class ConsultationConverter implements Converter<Consultation, de.oklab.leipzig.oparl.entities.Consultation> {

    @Autowired
    private OParlRepository oParlRepository;

    private Map<URI, de.oklab.leipzig.oparl.entities.Body> bodies = new HashMap<>();
    private Map<URI, de.oklab.leipzig.oparl.entities.AgendaItem> agendaItems = new HashMap<>();

    @Override
    public de.oklab.leipzig.oparl.entities.Consultation convert(Consultation source) {
        de.oklab.leipzig.oparl.entities.Consultation entity = new de.oklab.leipzig.oparl.entities.Consultation();
//        entity.setCreated(source.getCreated());
//        entity.setModified(source.getModified());
//        entity.setPolitikBeiUnsOriginalId(source.getOriginalId());
//        URI bodyURI = source.getBody();
//        Body body = null;
//        if (!bodies.containsKey(bodyURI)) {
//            body = oParlRepository.findBodyByURI(bodyURI);
//            bodies.put(bodyURI, body);
//        } else {
//            body = bodies.get(bodyURI);
//        }
//        entity.setBody(body);
//        URI agendaItemURI = source.getAgendaItem();
//        AgendaItem agendaItem = null;
//        if (!agendaItems.containsKey(agendaItemURI)) {
//            agendaItem = oParlRepository.findAgendaItemByURI(agendaItemURI);
//            agendaItems.put(agendaItemURI, agendaItem);
//        } else {
//            agendaItem = agendaItems.get(agendaItemURI);
//        }
//        entity.setAgendaItem(agendaItem);
//        entity.setOriginalId(source.getId());
        return entity;
    }
}
