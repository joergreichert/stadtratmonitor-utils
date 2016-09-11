package de.oklab.leipzig.oparl.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AgendaItemResult {
    @JsonProperty("int")
    private Float resultInt;

    public Float getResultInt() {
        return resultInt;
    }

    public void setResultInt(Float resultInt) {
        this.resultInt = resultInt;
    }
}
