package de.oklab.leipzig.oparl.service.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meeting {
    private URI body;
    @JsonProperty("PolitikBeiUns:originalId")
    private String originalId;
    private Date end;
    private String description;
    @JsonProperty("PolitikBeiUns:originalURL")
    private URI originalURL;
    private Date created;
    @JsonProperty("PolitikBeiUns:address")
    private String address;
    private Date modified;
    private List<AgendaItem> agendaItem = new ArrayList<AgendaItem>();

    public URI getBody() {
        return body;
    }

    public void setBody(URI body) {
        this.body = body;
    }

    public String getOriginalId() {
        return originalId;
    }

    public void setOriginalId(String originalId) {
        this.originalId = originalId;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public URI getOriginalURL() {
        return originalURL;
    }

    public void setOriginalURL(URI originalURL) {
        this.originalURL = originalURL;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public List<AgendaItem> getAgendaItem() {
        return agendaItem;
    }

    public void setAgendaItem(List<AgendaItem> agendaItem) {
        this.agendaItem = agendaItem;
    }
}
