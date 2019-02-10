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
@Document(collection = "meeting")
public class Meeting extends AbstractDatedEntity {

    @Field("name")
    private String name;

    @Field("description")
    private String description;

    @Field("politikBeiUnsOriginalId")
    private String politikBeiUnsOriginalId;

    @Field("organization_name")
    private String organizationName;

    @Field("originalUrl")
    private String originalUrl;

    @Field("address")
    private String address;

    @DBRef(lazy = true)
    @Field("agendaItem")
    private List<AgendaItem> agendaItem;

    @Field("room")
    private String room;

    @Field("type")
    private String type;

    @DBRef(lazy = true)
    @Field("auxiliaryFile")
    private List<File> auxiliaryFile;

    @Field("invitation")
    private File invitation;

    @Field("resultsProtocol")
    private File resultsProtocol;
}
