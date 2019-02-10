package de.oklab.leipzig.oparl.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Document(collection = "paper")
public class Paper extends AbstractEntity {

    @DBRef(lazy = true)
    @Field("auxiliaryFile")
    private List<File> auxiliaryFile;

    @Field("description")
    private String description;

    @DBRef(lazy = true)
    @Field("mainFile")
    private File mainFile;

    @Field("name")
    private String name;

    @Field("originalUrl")
    private String originalUrl;

    @Field("paperType")
    private String paperType;

    @Field("publishedDate")
    private Date publishedDate;
}
