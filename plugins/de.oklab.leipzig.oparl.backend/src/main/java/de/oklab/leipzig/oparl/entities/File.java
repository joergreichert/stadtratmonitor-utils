package de.oklab.leipzig.oparl.entities;

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
@Document(collection = "file")
public class File extends AbstractEntity {
    @DBRef(lazy = true)
    @Field("file")
    private List<File> file;

    @Field("filename")
    private String filename;

    @Field("mimetype")
    private String mimetype;

    @Field("name")
    private String name;

    @Field("originalDownloadPossible")
    private Boolean originalDownloadPossible;

    @Field("sha1Checksum")
    private String sha1Checksum;

    @Field("size")
    private Long size;

    @Field("depublication")
    private String depublication;

    @Field("fulltext")
    private String fulltext;

    @Field("fulltextGenerated")
    private String fulltextGenerated;

    @Field("thumbnails")
    private String thumbnails;

    @Field("thumbnailsGenerated")
    private String thumbnailsGenerated;
}
