package de.oklab.leipzig.oparl.service.model;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class System {
    private URI body;
    private URL website;
    String product;
    private URI oparlVersion;
    private String contactEmail;
    private String contactName;
    String vendor;
    private URI id;
    private URL web;
    private String name;
    private Date created;
    private Date modified;
    private URI type;
    private List<Object> otherOparlVersions = new ArrayList<>();

    public URI getBody() {
        return body;
    }

    public void setBody(URI body) {
        this.body = body;
    }

    public URL getWebsite() {
        return website;
    }

    public void setWebsite(URL website) {
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

    public URI getId() {
        return id;
    }

    public void setId(URI id) {
        this.id = id;
    }

    public URL getWeb() {
        return web;
    }

    public void setWeb(URL web) {
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

    public URI getType() {
        return type;
    }

    public void setType(URI type) {
        this.type = type;
    }

    public List<Object> getOtherOparlVersions() {
        return otherOparlVersions;
    }

    public void setOtherOparlVersions(List<Object> otherOparlVersions) {
        this.otherOparlVersions = otherOparlVersions;
    }
}
