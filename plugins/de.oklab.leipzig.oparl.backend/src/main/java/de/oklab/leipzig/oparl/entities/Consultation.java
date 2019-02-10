package de.oklab.leipzig.oparl.entities;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Document(collection = "consultation")
public class Consultation extends AbstractEntity {
    @DBRef(lazy = true)
    private AgendaItem agendaItem;

    @DBRef(lazy = true)
    private Paper paper;

    @Field
    private String politikBeiUnsOriginalId;
}
