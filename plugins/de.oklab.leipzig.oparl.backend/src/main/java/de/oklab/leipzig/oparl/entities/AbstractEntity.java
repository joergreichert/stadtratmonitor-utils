package de.oklab.leipzig.oparl.entities;

import java.net.URI;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Field;

public abstract class AbstractEntity {

    @Field("originalId")
    private URI originalId;

    @Field("created")
    private Date created;

    @Field("modified")
    private Date modified;

    @DBRef(lazy = true)
    @Field("body")
    private Body body;

    public URI getOriginalId() {
        return originalId;
    }

    public void setOriginalId(URI originalId) {
        this.originalId = originalId;
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

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
