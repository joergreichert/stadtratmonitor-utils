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
public class Membership {
    private URI id;
    private URI type;
    private URI person;
    private URI organization;
    private String role;
    private Boolean votingRight;
    private String startDate;
    private String endDate;
    private String onBehalfOf;
    private String license;
    private List<String> keyword = new ArrayList<String>();
    private Date created;
    private Date modified;
    private String web;
    private Boolean deleted;
    @JsonProperty("PolitikBeiUns:originalId")
    private String originalId;
}
