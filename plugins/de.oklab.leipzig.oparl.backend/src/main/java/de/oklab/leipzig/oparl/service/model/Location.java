package de.oklab.leipzig.oparl.service.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Location {
    private URI id;
    private URI type;
    private String description;
    private File geojson;
    private String streetAddress;
    private String room;
    private String postalCode;
    private String subLocality;
    private String locality;
    private List<URI> bodies = new ArrayList<>();
    private List<URI> organizations = new ArrayList<>();
    private List<URI> persons = new ArrayList<>();
    private List<URI> meetings = new ArrayList<>();
    private List<URI> papers = new ArrayList<>();
    private String license;
    private List<String> keyword = new ArrayList<String>();
    private Date created;
    private Date modified;
    private String web;
    private Boolean deleted;
}
