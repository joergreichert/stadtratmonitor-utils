package de.oklab.leipzig.oparl.service.model;

import java.net.URI;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Consultation {
    private URI body;
    private Date created;
    private Date modified;
    private URI agendaItem;
    private URI paper;
    @JsonProperty("PolitikBeiUns:originalId")
    private String originalId;
    private URI type;
    private URI id;

    public URI getBody() {
        return body;
    }

    public void setBody(URI body) {
        this.body = body;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public URI getAgendaItem() {
        return agendaItem;
    }

    public void setAgendaItem(URI agendaItem) {
        this.agendaItem = agendaItem;
    }

    public URI getPaper() {
        return paper;
    }

    public void setPaper(URI paper) {
        this.paper = paper;
    }

    public String getOriginalId() {
        return originalId;
    }

    public void setOriginalId(String originalId) {
        this.originalId = originalId;
    }

    public URI getType() {
        return type;
    }

    public void setType(URI type) {
        this.type = type;
    }

    public URI getId() {
        return id;
    }

    public void setId(URI id) {
        this.id = id;
    }
}
