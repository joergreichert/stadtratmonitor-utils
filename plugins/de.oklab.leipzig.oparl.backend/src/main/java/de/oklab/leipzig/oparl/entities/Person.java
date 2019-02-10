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
@Document(collection = "person")
public class Person extends AbstractEntity {

    @Field("address")
    private String address;

    @Field("email")
    private String email;

    @Field("fax")
    private String fax;

    @Field("firstname")
    private String firstname;

    @Field("house_number")
    private String houseNumber;

    @Field("lastname")
    private String lastname;

    @DBRef(lazy = true)
    @Field("membership")
    private Membership membership;

    @Field("mobile")
    private String mobile;

    @Field("originalUrl")
    private String originalUrl;

    @Field("phone")
    private String phone;

    @Field("postalcode")
    private String postalcode;

    @Field("sex")
    private String sex;

    @Field("title")
    private String title;

    @Field
    private String politikBeiUnsOriginalId;
}
