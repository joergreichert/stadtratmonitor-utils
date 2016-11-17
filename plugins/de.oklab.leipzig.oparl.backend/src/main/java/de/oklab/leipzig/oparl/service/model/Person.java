package de.oklab.leipzig.oparl.service.model;

import java.net.URI;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    private URI body;
    private Date created;
    private Date modified;
    @JsonProperty("PolitikBeiUns:originalId")
    private String originalId;
    private URI id;
    private URI type;
    private String name;
    private List<Membership> membership;

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

    public String getOriginalId() {
        return originalId;
    }

    public void setOriginalId(String originalId) {
        this.originalId = originalId;
    }

    public URI getId() {
        return id;
    }

    public void setId(URI id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URI getType() {
        return type;
    }

    public void setType(URI type) {
        this.type = type;
    }

    public List<Membership> getMembership() {
        return membership;
    }

    public void setMembership(List<Membership> membership) {
        this.membership = membership;
    }
}
