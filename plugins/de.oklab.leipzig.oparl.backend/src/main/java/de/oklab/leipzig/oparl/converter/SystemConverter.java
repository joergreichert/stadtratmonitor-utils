package de.oklab.leipzig.oparl.converter;

import java.net.URISyntaxException;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import de.oklab.leipzig.oparl.def.Oparl.System.Builder;
import de.oklab.leipzig.oparl.service.model.System;

@Component
public class SystemConverter implements Converter<System, de.oklab.leipzig.oparl.def.Oparl.System> {

    @Override
    public de.oklab.leipzig.oparl.def.Oparl.System convert(System source) {
        Builder builder = de.oklab.leipzig.oparl.def.Oparl.System.newBuilder();
        builder.setContactEmail(source.getContactEmail());
        builder.setContactName(source.getContactName());
        builder.setCreated(source.getCreated() != null ? source.getCreated().getTime() : 0L);
        builder.setModified(source.getModified() != null ? source.getModified().getTime() : 0L);
        builder.setName(source.getName());
        builder.setOparlVersion(source.getOparlVersion() != null ? source.getOparlVersion().toString() : null);
        for (int i = 0; i < source.getOtherOparlVersions().size(); i++) {
            builder.setOtherOparlVersions(i, String.valueOf(source.getOtherOparlVersions().get(i)));
        }
        builder.setProduct(source.getProduct());
        builder.setVendor(source.getVendor());
        try {
            builder.setWeb(source.getWeb() != null ? source.getWeb().toURI().toString() : null);
        } catch (URISyntaxException e) {
            // ignore
        }
        try {
            builder.setWebsite(source.getWebsite() != null ? source.getWebsite().toURI().toString() : null);
        } catch (URISyntaxException e) {
            // ignore
        }
        return builder.build();
    }
}
