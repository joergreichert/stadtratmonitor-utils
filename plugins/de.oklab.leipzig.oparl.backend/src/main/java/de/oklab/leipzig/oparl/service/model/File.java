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
public class File {
    private URI id;
    private String type;
    private String name;
    private String fileName;
    private String mimeType;
    private String date;
    private Integer size;
    private String sha1Checksum;
    private String sha512Checksum;
    private String text;
    private URI accessUrl;
    private String downloadUrl;
    private String externalServiceUrl;
    private String masterFile;
    private List<String> derivativeFile = new ArrayList<String>();
    private String fileLicense;
    private List<String> meeting = new ArrayList<String>();
    private List<String> agendaItem = new ArrayList<String>();
    private String person;
    private List<String> paper = new ArrayList<String>();
    private String license;
    private List<String> keyword = new ArrayList<String>();
    private Date created;
    private Date modified;
    private String web;
    private Boolean deleted;
    @JsonProperty("PolitikBeiUns:originalId")
    private String originalId;
}
