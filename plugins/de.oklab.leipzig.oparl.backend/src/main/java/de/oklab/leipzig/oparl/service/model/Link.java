package de.oklab.leipzig.oparl.service.model;

import java.net.URI;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Link {
    @JsonDeserialize(using = FailSafeUriDeserializer.class)
    private URI first;
    @JsonDeserialize(using = FailSafeUriDeserializer.class)
    private URI next;
}
