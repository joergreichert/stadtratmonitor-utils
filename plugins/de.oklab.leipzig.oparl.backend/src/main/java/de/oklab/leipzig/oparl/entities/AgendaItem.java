package de.oklab.leipzig.oparl.entities;

import java.net.URI;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "agendaitem")
public class AgendaItem {

    @DBRef(lazy = true)
    @Field
    private Body body;

    @Field
    private String name;

    @Id
    @Field
    private URI originalId;

    @Field
    private String politikBeiUnsOriginalId;

    @Field
    private Date created;

    @Field
    private Date modified;

    @Field("public")
    private boolean wasPublic;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URI getOriginalId() {
        return originalId;
    }

    public void setOriginalId(URI originalId) {
        this.originalId = originalId;
    }

    public String getPolitikBeiUnsOriginalId() {
        return politikBeiUnsOriginalId;
    }

    public void setPolitikBeiUnsOriginalId(String politikBeiUnsOriginalId) {
        this.politikBeiUnsOriginalId = politikBeiUnsOriginalId;
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

    public boolean isWasPublic() {
        return wasPublic;
    }

    public void setWasPublic(boolean wasPublic) {
        this.wasPublic = wasPublic;
    }
}
