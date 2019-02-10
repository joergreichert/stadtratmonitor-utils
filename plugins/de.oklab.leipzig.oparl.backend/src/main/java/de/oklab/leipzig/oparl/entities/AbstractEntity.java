package de.oklab.leipzig.oparl.entities;

import java.net.URI;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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
}
