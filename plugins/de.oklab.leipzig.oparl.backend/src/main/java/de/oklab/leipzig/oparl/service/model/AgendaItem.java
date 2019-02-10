package de.oklab.leipzig.oparl.service.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AgendaItem {
    private URI id;
    private URI type;
    private URI meeting;
    private String number;
    private Integer order;
    private String name;
    @JsonProperty("public")
    private boolean wasPublic;
    private URI consultation;
    private AgendaItemResult result;
    private String resolutionText;
    private File resolutionFile;
    private List<File> auxiliaryFile = new ArrayList<File>();
    private Date start;
    private Date end;
    private String license;
    private List<String> keyword = new ArrayList<String>();
    private Date created;
    private Date modified;
    private String web;
    private Boolean deleted;
    @JsonProperty("PolitikBeiUns:originalId")
    private String originalId;
}
