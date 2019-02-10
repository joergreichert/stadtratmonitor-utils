package de.oklab.leipzig.oparl.entities;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Document(collection = "membership")
public class Membership extends AbstractDatedEntity {

    @Field
    private String politikBeiUnsOriginalId;

    @DBRef(lazy = true)
    @Field("organization")
    private Organization organization;

    @Field
    private String role;
}
