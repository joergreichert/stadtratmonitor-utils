package de.oklab.leipzig.oparl.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "paper")
public class Paper extends AbstractEntity {

    @DBRef(lazy = true)
    @Field("auxiliaryFile")
    private List<File> auxiliaryFile;

    @Field("description")
    private String description;

    @DBRef(lazy = true)
    @Field("mainFile")
    private File mainFile;

    @Field("name")
    private String name;

    @Field("originalUrl")
    private String originalUrl;

    @Field("paperType")
    private String paperType;

    @Field("publishedDate")
    private Date publishedDate;

    public List<File> getAuxiliaryFile() {
        return auxiliaryFile;
    }

    public void setAuxiliaryFile(List<File> auxiliaryFile) {
        this.auxiliaryFile = auxiliaryFile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public File getMainFile() {
        return mainFile;
    }

    public void setMainFile(File mainFile) {
        this.mainFile = mainFile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
}
