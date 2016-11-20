package de.oklab.leipzig.oparl.entities;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class System {

    private URI website;

    private String product;

    private URI oparlVersion;

    private String contactEmail;

    private String contactName;

    private String vendor;

    private URI originalId;

    private URI web;

    private String name;

    private Date created;

    private Date modified;

    private List<String> otherOparlVersions = new ArrayList<>();

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
