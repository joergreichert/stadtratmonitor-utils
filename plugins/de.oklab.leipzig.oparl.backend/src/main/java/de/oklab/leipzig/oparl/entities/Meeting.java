package de.oklab.leipzig.oparl.entities;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "meeting")
public class Meeting extends AbstractDatedEntity {

    @Field("name")
    private String name;

    @Field("description")
    private String description;

    @Field("politikBeiUnsOriginalId")
    private String politikBeiUnsOriginalId;

    @Field("organization_name")
    private String organizationName;

    @Field("originalUrl")
    private String originalUrl;

    @Field("address")
    private String address;

    @DBRef
    @Field("agendaItem")
    private List<AgendaItem> agendaItem;

    @Field("room")
    private String room;

    @Field("type")
    private String type;

    @DBRef
    @Field("auxiliaryFile")
    private List<File> auxiliaryFile;

    @Field("invitation")
    private File invitation;

    @Field("resultsProtocol")
    private File resultsProtocol;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPolitikBeiUnsOriginalId() {
        return politikBeiUnsOriginalId;
    }

    public void setPolitikBeiUnsOriginalId(String politikBeiUnsOriginalId) {
        this.politikBeiUnsOriginalId = politikBeiUnsOriginalId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<AgendaItem> getAgendaItem() {
        return agendaItem;
    }

    public void setAgendaItem(List<AgendaItem> agendaItem) {
        this.agendaItem = agendaItem;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<File> getAuxiliaryFile() {
        return auxiliaryFile;
    }

    public void setAuxiliaryFile(List<File> auxiliaryFile) {
        this.auxiliaryFile = auxiliaryFile;
    }

    public File getInvitation() {
        return invitation;
    }

    public void setInvitation(File invitation) {
        this.invitation = invitation;
    }

    public File getResultsProtocol() {
        return resultsProtocol;
    }

    public void setResultsProtocol(File resultsProtocol) {
        this.resultsProtocol = resultsProtocol;
    }
}
