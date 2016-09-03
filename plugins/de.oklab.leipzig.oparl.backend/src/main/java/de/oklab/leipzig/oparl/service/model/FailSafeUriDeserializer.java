package de.oklab.leipzig.oparl.service.model;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class FailSafeUriDeserializer extends JsonDeserializer<URI> {

    @Override
    public URI deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String value = p.getValueAsString();
        return URI.create(URLEncoder.encode(value, "UTF-8"));
    }
}
