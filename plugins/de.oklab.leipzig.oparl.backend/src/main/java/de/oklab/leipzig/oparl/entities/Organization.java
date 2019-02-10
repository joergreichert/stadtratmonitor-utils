package de.oklab.leipzig.oparl.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Document(collection = "organization")
public class Organization extends AbstractEntity {

    @DBRef(lazy = true)
    @Field
    private List<Meeting> meeting;

    @DBRef(lazy = true)
    @Field
    private List<Membership> membership = new ArrayList<>();

    @Field
    private String politikBeiUnsOriginalId;

    @Field("classification")
    private String classification;

    @Field("name")
    private String name;

    @Field("slug")
    private String slug;
}
