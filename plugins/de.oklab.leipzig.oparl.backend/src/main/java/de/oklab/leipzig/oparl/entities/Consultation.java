package de.oklab.leipzig.oparl.entities;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "consultation")
public class Consultation extends AbstractEntity {
    @DBRef(lazy = true)
    private AgendaItem agendaItem;

    @DBRef(lazy = true)
    private Paper paper;

    private String politikBeiUnsOriginalId;

    public AgendaItem getAgendaItem() {
        return agendaItem;
    }

    public void setAgendaItem(AgendaItem agendaItem) {
        this.agendaItem = agendaItem;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public String getPolitikBeiUnsOriginalId() {
        return politikBeiUnsOriginalId;
    }

    public void setPolitikBeiUnsOriginalId(String politikBeiUnsOriginalId) {
        this.politikBeiUnsOriginalId = politikBeiUnsOriginalId;
    }
}
