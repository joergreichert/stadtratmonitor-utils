package de.oklab.leipzig.oparl.converter;

import java.net.URISyntaxException;
import java.util.stream.Collectors;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import de.oklab.leipzig.oparl.service.model.System;

@Component
public class SystemConverter implements Converter<System, de.oklab.leipzig.oparl.entities.System> {

    @Override
    public de.oklab.leipzig.oparl.entities.System convert(System source) {
        de.oklab.leipzig.oparl.entities.System entity = new de.oklab.leipzig.oparl.entities.System();
        entity.setContactEmail(source.getContactEmail());
        entity.setContactName(source.getContactName());
        entity.setCreated(source.getCreated());
        entity.setOriginalId(source.getId());
        entity.setModified(source.getModified());
        entity.setName(source.getName());
        entity.setOparlVersion(source.getOparlVersion());
        entity.setOtherOparlVersions(
                source.getOtherOparlVersions().stream().map(v -> String.valueOf(v)).collect(Collectors.toList()));
        entity.setProduct(source.getProduct());
        entity.setVendor(source.getVendor());
        try {
            entity.setWeb(source.getWeb() != null ? source.getWeb().toURI() : null);
        } catch (URISyntaxException e) {
            // ignore
        }
        try {
            entity.setWebsite(source.getWebsite() != null ? source.getWebsite().toURI() : null);
        } catch (URISyntaxException e) {
            // ignore
        }
        return entity;
    }
}
