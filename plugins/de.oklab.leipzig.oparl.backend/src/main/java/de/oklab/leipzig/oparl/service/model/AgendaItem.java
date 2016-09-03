package de.oklab.leipzig.oparl.service.model;

import java.net.URI;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AgendaItem {
    private URI body;
    private String name;
    private URI id;
    @JsonProperty("PolitikBeiUns:originalId")
    private String originalId;
    private Date created;
    @JsonProperty("PolitikBeiUns:address")
    private String address;
    private Date modified;
    @JsonProperty("public")
    private boolean wasPublic;

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

    public URI getId() {
        return id;
    }

    public void setId(URI id) {
        this.id = id;
    }

    public String getOriginalId() {
        return originalId;
    }

    public void setOriginalId(String originalId) {
        this.originalId = originalId;
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

    public boolean isWasPublic() {
        return wasPublic;
    }

    public void setWasPublic(boolean wasPublic) {
        this.wasPublic = wasPublic;
    }
}
