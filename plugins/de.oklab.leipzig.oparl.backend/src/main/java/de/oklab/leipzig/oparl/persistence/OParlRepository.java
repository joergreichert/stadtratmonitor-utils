package de.oklab.leipzig.oparl.persistence;

import java.net.URI;
import java.util.List;

import org.springframework.data.util.CloseableIterator;

import de.oklab.leipzig.oparl.entities.AgendaItem;
import de.oklab.leipzig.oparl.entities.Body;
import de.oklab.leipzig.oparl.entities.Consultation;
import de.oklab.leipzig.oparl.entities.Meeting;
import de.oklab.leipzig.oparl.entities.Organization;

public interface OParlRepository {

    public CloseableIterator<Meeting> getMeetings();

    public List<Consultation> getConsultations(Meeting meeting);

    public List<Consultation> getConsultations();

    public Body findBodyByURI(URI uri);

    public Organization findOrganizationByURI(URI uri);

    public AgendaItem findAgendaItemByURI(URI agendaItemURI);

	public Meeting findMeetingByURI(URI meetingURI);
}
