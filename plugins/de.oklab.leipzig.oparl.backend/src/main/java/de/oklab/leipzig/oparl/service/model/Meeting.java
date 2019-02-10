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
public class Meeting {
    private URI id;
    private String type;
    private String name;
    private String meetingState;
    private Boolean cancelled;
    private Date start;
    private Date end;
    private Location location;
    private List<String> organization = new ArrayList<String>();
    private List<String> participant = new ArrayList<String>();
    private File invitation;
    private File resultsProtocol;
    private File verbatimProtocol;
    private List<File> auxiliaryFile = new ArrayList<File>();
    private List<AgendaItem> agendaItem = new ArrayList<AgendaItem>();
    private String license;
    private List<String> keyword = new ArrayList<String>();
    private Date created;
    private Date modified;
    private String web;
    private Boolean deleted;
    @JsonProperty("PolitikBeiUns:originalId")
    private String originalId;
}
