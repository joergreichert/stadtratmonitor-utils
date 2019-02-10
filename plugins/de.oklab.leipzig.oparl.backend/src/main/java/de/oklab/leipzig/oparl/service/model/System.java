package de.oklab.leipzig.oparl.service.model;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class System {
    private URI id;
    private URI type;
    private URI oparlVersion;
    private List<String> otherOparlVersions = new ArrayList<String>();
    private String license;
    private URI body;
    private String name;
    private String contactEmail;
    private String contactName;
    private URL website;
    private String vendor;
    private String product;
    private Date created;
    private Date modified;
    private URL web;
    private Boolean deleted;
}
