package de.oklab.leipzig.oparl.entities;

import java.net.URI;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "body")
public class Body {

    @DBRef
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

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public List<Meeting> getMeeting() {
        return meeting;
    }

    public void setMeeting(List<Meeting> meeting) {
        this.meeting = meeting;
    }

    public String getGeofabrikData() {
        return geofabrikData;
    }

    public void setGeofabrikData(String geofabrikData) {
        this.geofabrikData = geofabrikData;
    }

    public List<String> getLegislativeTerm() {
        return legislativeTerm;
    }

    public void setLegislativeTerm(List<String> legislativeTerm) {
        this.legislativeTerm = legislativeTerm;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    public List<Paper> getPaper() {
        return paper;
    }

    public void setPaper(List<Paper> paper) {
        this.paper = paper;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getRegionalschluessel() {
        return regionalschluessel;
    }

    public void setRegionalschluessel(String regionalschluessel) {
        this.regionalschluessel = regionalschluessel;
    }

    public List<Organization> getOrganization() {
        return organization;
    }

    public void setOrganization(List<Organization> organization) {
        this.organization = organization;
    }

    public URI getOriginalId() {
        return originalId;
    }

    public void setOriginalId(URI originalId) {
        this.originalId = originalId;
    }

    public String getOsmRelation() {
        return osmRelation;
    }

    public void setOsmRelation(String osmRelation) {
        this.osmRelation = osmRelation;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicenseValidSince() {
        return licenseValidSince;
    }

    public void setLicenseValidSince(String licenseValidSince) {
        this.licenseValidSince = licenseValidSince;
    }
}
