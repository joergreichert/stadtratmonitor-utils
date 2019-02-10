
package de.oklab.leipzig.oparl.service.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Paper {
    private URI id;
    private URI type;
    private URI body;
    private String name;
    private String reference;
    private String date;
    private String paperType;
    private List<URI> relatedPaper = new ArrayList<>();
    private List<URI> superordinatedPaper = new ArrayList<>();
    private List<URI> subordinatedPaper = new ArrayList<>();
    private File mainFile;
    private List<File> auxiliaryFile = new ArrayList<>();
    private List<Location> location = new ArrayList<>();
    private List<URI> originatorPerson = new ArrayList<>();
    private List<String> underDirectionOf = new ArrayList<>();
    private List<String> originatorOrganization = new ArrayList<>();
    private List<Consultation> consultation = new ArrayList<>();
    private String license;
    private List<String> keyword = new ArrayList<String>();
    private Date created;
    private Date modified;
    private String web;
    private Boolean deleted;
}
