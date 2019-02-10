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
public class Organization {
    private URI id;
    private URI type;
    private URI body;
    private String name;
    private List<URI> membership = new ArrayList<>();
    private URI meeting;
    private String consultation;
    private String shortName;
    private List<String> post = new ArrayList<String>();
    private String subOrganizationOf;
    private String organizationType;
    private String classification;
    private String startDate;
    private String endDate;
    private String website;
    private Location location;
    private String externalBody;
    private String license;
    private List<String> keyword = new ArrayList<String>();
    private Date created;
    private Date modified;
    private String web;
    private Boolean deleted;
    @JsonProperty("PolitikBeiUns:originalId")
    private String originalId;
}
