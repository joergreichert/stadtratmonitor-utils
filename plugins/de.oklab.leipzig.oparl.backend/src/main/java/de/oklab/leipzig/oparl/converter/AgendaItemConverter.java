package de.oklab.leipzig.oparl.converter;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import de.oklab.leipzig.oparl.entities.Meeting;
import de.oklab.leipzig.oparl.persistence.OParlRepository;
import de.oklab.leipzig.oparl.service.model.AgendaItem;

@Component
public class AgendaItemConverter implements Converter<AgendaItem, de.oklab.leipzig.oparl.entities.AgendaItem> {

    @Autowired
    private OParlRepository oParlRepository;

    private Map<URI, de.oklab.leipzig.oparl.entities.Meeting> meetings = new HashMap<>();

    @Override
    public de.oklab.leipzig.oparl.entities.AgendaItem convert(AgendaItem source) {
        de.oklab.leipzig.oparl.entities.AgendaItem entity = new de.oklab.leipzig.oparl.entities.AgendaItem();
        entity.setCreated(source.getCreated());
        entity.setModified(source.getModified());
        entity.setPolitikBeiUnsOriginalId(source.getOriginalId());
        entity.setOriginalId(source.getId());
        entity.setWasPublic(source.isWasPublic());
        URI meetingURI = source.getMeeting();
        Meeting meeting = null;
        if (!meetings.containsKey(meetingURI)) {
        	meeting = oParlRepository.findMeetingByURI(meetingURI);
            meetings.put(meetingURI, meeting);
        } else {
        	meeting = meetings.get(meetingURI);
        }
        entity.setMeeting(meeting);
        return entity;
    }
}
