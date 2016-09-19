package de.oklab.leipzig.oparl.service.model;

import java.net.URI;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Membership {
    private URI body;
    private Date created;
    private Date modified;
    private Date startDate;
    private Date endDate;
    private URI person;
    private String role;
    private URI organization;
    @JsonProperty("PolitikBeiUns:originalId")
    private String originalId;
    private URI type;
    private URI id;

    public URI getId() {
        return id;
    }

    public void setId(URI id) {
        this.id = id;
    }

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public URI getPerson() {
        return person;
    }

    public void setPerson(URI person) {
        this.person = person;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public URI getOrganization() {
        return organization;
    }

    public void setOrganization(URI organization) {
        this.organization = organization;
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
