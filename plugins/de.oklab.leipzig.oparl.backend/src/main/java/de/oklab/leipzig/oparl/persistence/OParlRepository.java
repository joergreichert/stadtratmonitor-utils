package de.oklab.leipzig.oparl.persistence;

import java.util.List;

import org.springframework.data.util.CloseableIterator;

import de.oklab.leipzig.oparl.entities.Consultation;
import de.oklab.leipzig.oparl.entities.Meeting;

public interface OParlRepository {

    public CloseableIterator<Meeting> getMeetings();

    public List<Consultation> getConsultations(Meeting meeting);

    public List<Consultation> getConsultations();

}
