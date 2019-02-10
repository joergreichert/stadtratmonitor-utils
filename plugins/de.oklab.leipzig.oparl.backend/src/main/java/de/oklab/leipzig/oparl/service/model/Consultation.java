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
public class Consultation {
    private URI id;
    private URI type;
    private URI paper;
    private URI agendaItem;
    private String meeting;
    private List<String> organization = new ArrayList<String>();
    private Boolean authoritative;
    private String role;
    private String license;
    private List<String> keyword = new ArrayList<String>();
    private Date created;
    private Date modified;
    private String web;
    private Boolean deleted;
    @JsonProperty("PolitikBeiUns:originalId")
    private String originalId;
}
