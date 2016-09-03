package de.oklab.leipzig.oparl.entities;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Field;

public abstract class AbstractDatedEntity extends AbstractEntity {

    @Field("start")
    private Date start;

    @Field("end")
    private Date end;

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
