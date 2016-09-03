package de.oklab.leipzig.oparl.service.model;

import java.net.URI;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class File {
    private String mimeType;
    private String text;
    private URI id;
    private Long size;
    private URI accessUrl;
    @JsonProperty("PolitikBeiUns:originalDownloadPossible")
    private Boolean originalDownloadPossible;
    private String type;
    private URI body;
    private String fileName;
    @JsonProperty("PolitikBeiUns:originalId")
    private String originalId;
    private String name;
    private Date created;
    private String sha1Checksum;
    private Date modified;
    private URI downloadUrl;

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public URI getId() {
        return id;
    }

    public void setId(URI id) {
        this.id = id;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public URI getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(URI accessUrl) {
        this.accessUrl = accessUrl;
    }

    public Boolean getOriginalDownloadPossible() {
        return originalDownloadPossible;
    }

    public void setOriginalDownloadPossible(Boolean originalDownloadPossible) {
        this.originalDownloadPossible = originalDownloadPossible;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public URI getBody() {
        return body;
    }

    public void setBody(URI body) {
        this.body = body;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getOriginalId() {
        return originalId;
    }

    public void setOriginalId(String originalId) {
        this.originalId = originalId;
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

    public String getSha1Checksum() {
        return sha1Checksum;
    }

    public void setSha1Checksum(String sha1Checksum) {
        this.sha1Checksum = sha1Checksum;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public URI getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(URI downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}
