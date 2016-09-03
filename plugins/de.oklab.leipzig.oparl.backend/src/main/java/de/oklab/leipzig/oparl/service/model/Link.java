package de.oklab.leipzig.oparl.service.model;

import java.net.URI;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class Link {
    @JsonDeserialize(using = FailSafeUriDeserializer.class)
    private URI first;
    @JsonDeserialize(using = FailSafeUriDeserializer.class)
    private URI next;

    public URI getFirst() {
        return first;
    }

    public void setFirst(URI first) {
        this.first = first;
    }

    public URI getNext() {
        return next;
    }

    public void setNext(URI next) {
        this.next = next;
    }
}
