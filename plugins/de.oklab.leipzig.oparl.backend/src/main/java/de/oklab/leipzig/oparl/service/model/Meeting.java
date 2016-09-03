package de.oklab.leipzig.oparl.service.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meeting {
    private URI body;
    private URI id;
    @JsonProperty("PolitikBeiUns:originalId")
    private String originalId;
    private String shortName;
    private String name;
    private Date start;
    private Date end;
    private String description;
    @JsonProperty("PolitikBeiUns:originalUrl")
    private URI originalURL;
    private Date created;
    @JsonProperty("PolitikBeiUns:address")
    private String address;
    private Date modified;
    private String type;
    private File invitation;
    private List<File> auxiliaryFile;
    private File resultsProtocol;
    private List<AgendaItem> agendaItem = new ArrayList<AgendaItem>();

    public URI getBody() {
        return body;
    }

    public void setBody(URI body) {
        this.body = body;
    }

    public URI getId() {
        return id;
    }

    public void setId(URI id) {
        this.id = id;
    }

    public String getOriginalId() {
        return originalId;
    }

    public void setOriginalId(String originalId) {
        this.originalId = originalId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public URI getOriginalURL() {
        return originalURL;
    }

    public void setOriginalURL(URI originalURL) {
        this.originalURL = originalURL;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public File getInvitation() {
        return invitation;
    }

    public void setInvitation(File invitation) {
        this.invitation = invitation;
    }

    public List<File> getAuxiliaryFile() {
        return auxiliaryFile;
    }

    public void setAuxiliaryFile(List<File> auxiliaryFile) {
        this.auxiliaryFile = auxiliaryFile;
    }

    public File getResultsProtocol() {
        return resultsProtocol;
    }

    public void setResultsProtocol(File resultsProtocol) {
        this.resultsProtocol = resultsProtocol;
    }

    public List<AgendaItem> getAgendaItem() {
        return agendaItem;
    }

    public void setAgendaItem(List<AgendaItem> agendaItem) {
        this.agendaItem = agendaItem;
    }
}
