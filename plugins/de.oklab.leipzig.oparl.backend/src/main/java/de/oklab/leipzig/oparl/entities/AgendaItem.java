package de.oklab.leipzig.oparl.entities;

import java.net.URI;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "agendaitem")
@Data
@NoArgsConstructor
public class AgendaItem {

    @DBRef(lazy = true)
    @Field
    private Meeting meeting;

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
}
