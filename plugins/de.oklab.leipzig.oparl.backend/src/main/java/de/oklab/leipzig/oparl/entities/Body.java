package de.oklab.leipzig.oparl.entities;

import java.net.URI;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "body")
@Data
@NoArgsConstructor
public class Body {

    @DBRef(lazy = true)
    @Field
    private System system;

    @Field
    private String name;

    @Field
    private Date created;

    @Field
    private List<Meeting> meeting;

    @Field
    private String geofabrikData;

    @Field
    private List<String> legislativeTerm;

    @Field
    private Date modified;

    @Field
    private String contactEmail;

    @Field
    private List<Person> person;

    @Field
    private List<Paper> paper;

    @Field
    private String contactName;

    @Field
    private String regionalschluessel;

    @Field
    private List<Organization> organization;

    @Id
    @Field
    private URI originalId;

    @Field
    private String osmRelation;

    @Field
    private String license;

    @Field
    private String licenseValidSince;
}
