package de.oklab.leipzig.oparl.entities;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "membership")
public class Membership extends AbstractDatedEntity {

    @Field
    private String politikBeiUnsOriginalId;

    @DBRef
    @Field("organization")
    private Organization organization;

    @Field
    private String role;

    public String getPolitikBeiUnsOriginalId() {
        return politikBeiUnsOriginalId;
    }

    public void setPolitikBeiUnsOriginalId(String politikBeiUnsOriginalId) {
        this.politikBeiUnsOriginalId = politikBeiUnsOriginalId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
