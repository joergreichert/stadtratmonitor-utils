package de.oklab.leipzig.oparl.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AgendaItemResult {
    @JsonProperty("int")
    private Float resultInt;
}
