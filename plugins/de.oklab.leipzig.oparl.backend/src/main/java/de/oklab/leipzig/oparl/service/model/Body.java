package de.oklab.leipzig.oparl.service.model;

import java.net.URI;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Body {
    private URI system;
    private String name;
    private Date created;
    private URI type;
    private URI meeting;
    @JsonProperty("geofabrik_data")
    private String geofabrikData;
    private List<String> legislativeTerm;
    private Date modified;
    private String contactEmail;
    private URI person;
    private URI paper;
    private String contactName;
    @JsonProperty("regionalschl\u00fcssel")
    private String regionalschluessel;
    private URI organization;
    private URI id;
    @JsonProperty("osm_relation")
    private String osmRelation;
    private String license;
    private String licenseValidSince;

    public Body() {
        // TODO Auto-generated constructor stub
    }

    public URI getSystem() {
        return system;
    }

    public void setSystem(URI system) {
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

    public URI getType() {
        return type;
    }

    public void setType(URI type) {
        this.type = type;
    }

    public URI getMeeting() {
        return meeting;
    }

    public void setMeeting(URI meeting) {
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

    public URI getPerson() {
        return person;
    }

    public void setPerson(URI person) {
        this.person = person;
    }

    public URI getPaper() {
        return paper;
    }

    public void setPaper(URI paper) {
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

    public URI getOrganization() {
        return organization;
    }

    public void setOrganization(URI organization) {
        this.organization = organization;
    }

    public URI getId() {
        return id;
    }

    public void setId(URI id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Data [system=" + system + ", name=" + name + ", created=" + created + ", type=" + type + ", meeting="
                + meeting + ", geofabrikData=" + geofabrikData + ", legislativeTerm=" + legislativeTerm + ", modified="
                + modified + ", contactEmail=" + contactEmail + ", person=" + person + ", paper=" + paper
                + ", contactName=" + contactName + ", regionalschluessel=" + regionalschluessel + ", organization="
                + organization + ", id=" + id + ", osmRelation=" + osmRelation + ", license=" + license
                + ", licenseValidSince=" + licenseValidSince + "]";
    }
}