package de.oklab.leipzig.oparl.entities;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public abstract class AbstractDatedEntity extends AbstractEntity {

    @Field("start")
    private Date start;

    @Field("end")
    private Date end;
}
