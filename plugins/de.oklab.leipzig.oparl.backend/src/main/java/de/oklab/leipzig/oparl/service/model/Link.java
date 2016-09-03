package de.oklab.leipzig.oparl.service.model;

import java.net.URI;

public class Link {
    private URI first;
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
