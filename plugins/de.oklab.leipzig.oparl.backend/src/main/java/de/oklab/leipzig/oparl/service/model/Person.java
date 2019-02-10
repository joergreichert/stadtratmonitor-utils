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
public class Person {
    private URI id;
    private URI type;
    private URI body;
    private String name;
    private String familyName;
    private String givenName;
    private String formOfAddress;
    private String affix;
    private List<String> title = new ArrayList<String>();
    private String gender;
    private List<String> phone = new ArrayList<String>();
    private List<String> email = new ArrayList<String>();
    private String location;
    private Location locationObject;
    private List<String> status = new ArrayList<String>();
    private List<Membership> membership = new ArrayList<>();
    private File image;
    private String life;
    private String lifeSource;
    private String license;
    private List<String> keyword = new ArrayList<String>();
    private Date created;
    private Date modified;
    private String web;
    private Boolean deleted;
    @JsonProperty("PolitikBeiUns:originalId")
    private String originalId;
}
