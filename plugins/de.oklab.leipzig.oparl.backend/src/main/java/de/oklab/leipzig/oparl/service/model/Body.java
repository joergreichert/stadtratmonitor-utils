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
public class Body {
    private URI id;
    private URI type;
    private URI system;
    private String shortName;
    private String name;
    private String website;
    private String license;
    private Date licenseValidSince;
    private Date oparlSince;
    private String ags;
    private String rgs;
    private List<String> equivalent = new ArrayList<String>();
    private String contactEmail;
    private String contactName;
    private URI organization;
    private URI person;
    private URI meeting;
    private URI paper;
    private List<LegislativeTerm> legislativeTerm = new ArrayList<LegislativeTerm>();
    private String agendaItem;
    private String consultation;
    private String file;
    private String locationList;
    private String legislativeTermList;
    private String membership;
    private String classification;
    private Location location;
    private List<String> keyword = new ArrayList<String>();
    private Date created;
    private Date modified;
    private String web;
    private Boolean deleted;
    @JsonProperty("PolitikBeiUns:originalId")
    private String originalId;
}