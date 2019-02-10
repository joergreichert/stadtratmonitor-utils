package de.oklab.leipzig.oparl.entities;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "system")
public class System {

    @DBRef(lazy = true)
    @Field("body")
    private List<Body> body = new ArrayList<>();

    @Field("website")
    private URI website;

    @Field("product")
    private String product;

    @Field("oparl_version")
    private URI oparlVersion;

    @Field("contact_email")
    private String contactEmail;

    @Field("contact_name")
    private String contactName;

    @Field("vendor")
    private String vendor;

    @Id
    @Field("originalId")
    private URI originalId;

    @Field("web")
    private URI web;

    @Field("name")
    private String name;

    @Field("created")
    private Date created;

    @Field("modified")
    private Date modified;

    @Field("other_oparl_versions")
    private List<String> otherOparlVersions = new ArrayList<>();
}
