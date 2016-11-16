package de.oklab.leipzig.oparl.converter;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import de.oklab.leipzig.oparl.entities.Body;
import de.oklab.leipzig.oparl.persistence.OParlRepository;
import de.oklab.leipzig.oparl.service.model.File;

@Component
public class FileConverter implements Converter<File, de.oklab.leipzig.oparl.entities.File> {

    @Autowired
    private OParlRepository oParlRepository;

    private Map<URI, de.oklab.leipzig.oparl.entities.Body> bodies = new HashMap<>();

    @Override
    public de.oklab.leipzig.oparl.entities.File convert(File source) {
        de.oklab.leipzig.oparl.entities.File entity = new de.oklab.leipzig.oparl.entities.File();
        URI bodyURI = source.getBody();
        Body body = null;
        if (!bodies.containsKey(bodyURI)) {
            body = oParlRepository.findBodyByURI(bodyURI);
            bodies.put(bodyURI, body);
        } else {
            body = bodies.get(bodyURI);
        }
        entity.setBody(body);
        entity.setCreated(source.getCreated());
        // TODO
        // entity.setFile();
        entity.setFilename(source.getFileName());
        entity.setMimetype(source.getMimeType());
        entity.setModified(source.getModified());
        entity.setName(source.getName());
        entity.setOriginalDownloadPossible(source.getOriginalDownloadPossible());
        entity.setOriginalId(source.getId());
        entity.setSha1Checksum(source.getSha1Checksum());
        entity.setSize(source.getSize());
        return entity;
    }
}
