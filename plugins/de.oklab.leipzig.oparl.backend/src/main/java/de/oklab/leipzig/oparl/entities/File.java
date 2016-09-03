package de.oklab.leipzig.oparl.entities;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "file")
public class File extends AbstractEntity {
    @DBRef
    @Field("file")
    private List<File> file;

    @Field("filename")
    private String filename;

    @Field("mimetype")
    private String mimetype;

    @Field("name")
    private String name;

    @Field("originalDownloadPossible")
    private Boolean originalDownloadPossible;

    @Field("sha1Checksum")
    private String sha1Checksum;

    @Field("size")
    private Long size;

    @Field("depublication")
    private String depublication;

    @Field("fulltext")
    private String fulltext;

    @Field("fulltextGenerated")
    private String fulltextGenerated;

    @Field("thumbnails")
    private String thumbnails;

    @Field("thumbnailsGenerated")
    private String thumbnailsGenerated;

    public List<File> getFile() {
        return file;
    }

    public void setFile(List<File> file) {
        this.file = file;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOriginalDownloadPossible() {
        return originalDownloadPossible;
    }

    public void setOriginalDownloadPossible(Boolean originalDownloadPossible) {
        this.originalDownloadPossible = originalDownloadPossible;
    }

    public String getSha1Checksum() {
        return sha1Checksum;
    }

    public void setSha1Checksum(String sha1Checksum) {
        this.sha1Checksum = sha1Checksum;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}
