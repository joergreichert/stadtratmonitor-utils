package de.oklab.leipzig.oparl.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

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

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public List<Meeting> getMeeting() {
        return meeting;
    }

    public void setMeeting(List<Meeting> meeting) {
        this.meeting = meeting;
    }

    public List<Membership> getMembership() {
        return membership;
    }

    public void setMembership(List<Membership> membership) {
        this.membership = membership;
    }

    public String getPolitikBeiUnsOriginalId() {
        return politikBeiUnsOriginalId;
    }

    public void setPolitikBeiUnsOriginalId(String politikBeiUnsOriginalId) {
        this.politikBeiUnsOriginalId = politikBeiUnsOriginalId;
    }
}
