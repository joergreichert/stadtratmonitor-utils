package de.oklab.leipzig.oparl.service.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Organization {
    private URI body;
    private String name;
    private String classification;
    private Date created;
    private URI meeting;
    private Date modified;
    private URI id;
    private List<URI> membership = new ArrayList<>();
    @JsonProperty("PolitikBeiUns:originalId")
    private String originalId;
    private URI type;

    public URI getBody() {
        return body;
    }

    public void setBody(URI body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public URI getMeeting() {
        return meeting;
    }

    public void setMeeting(URI meeting) {
        this.meeting = meeting;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public URI getId() {
        return id;
    }

    public void setId(URI id) {
        this.id = id;
    }

    public List<URI> getMembership() {
        return membership;
    }

    public void setMembership(List<URI> membership) {
        this.membership = membership;
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
}
