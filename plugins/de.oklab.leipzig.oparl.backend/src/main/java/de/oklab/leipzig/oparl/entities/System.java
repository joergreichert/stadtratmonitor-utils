package de.oklab.leipzig.oparl.entities;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "system")
public class System {

    @DBRef
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

    public List<Body> getBody() {
        return body;
    }

    public void setBody(List<Body> body) {
        this.body = body;
    }

    public URI getWebsite() {
        return website;
    }

    public void setWebsite(URI website) {
        this.website = website;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public URI getOparlVersion() {
        return oparlVersion;
    }

    public void setOparlVersion(URI oparlVersion) {
        this.oparlVersion = oparlVersion;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public URI getOriginalId() {
        return originalId;
    }

    public void setOriginalId(URI originalId) {
        this.originalId = originalId;
    }

    public URI getWeb() {
        return web;
    }

    public void setWeb(URI web) {
        this.web = web;
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

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public List<String> getOtherOparlVersions() {
        return otherOparlVersions;
    }

    public void setOtherOparlVersions(List<String> otherOparlVersions) {
        this.otherOparlVersions = otherOparlVersions;
    }
}
