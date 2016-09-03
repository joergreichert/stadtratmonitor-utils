package de.oklab.leipzig.oparl.converter;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import de.oklab.leipzig.oparl.persistence.SystemRepository;
import de.oklab.leipzig.oparl.service.model.Body;

@Component
public class BodyConverter implements Converter<Body, de.oklab.leipzig.oparl.entities.Body> {
    @Autowired
    private SystemRepository systemRepository;

    private de.oklab.leipzig.oparl.entities.System system;

    @Override
    public de.oklab.leipzig.oparl.entities.Body convert(Body source) {
        de.oklab.leipzig.oparl.entities.Body entity = new de.oklab.leipzig.oparl.entities.Body();
        entity.setContactEmail(source.getContactEmail());
        entity.setContactName(source.getContactName());
        entity.setCreated(source.getCreated());
        entity.setGeofabrikData(source.getGeofabrikData());
        entity.setLegislativeTerm(source.getLegislativeTerm());
        entity.setLicense(source.getLicense());
        entity.setLicenseValidSince(source.getLicenseValidSince());
        entity.setModified(source.getModified());
        entity.setName(source.getName());
        entity.setOriginalId(source.getId());
        entity.setOsmRelation(source.getOsmRelation());
        entity.setRegionalschluessel(source.getRegionalschluessel());
        if (system == null) {
            URI systemURI = source.getSystem();
            systemURI = URI
                    .create(systemURI.getScheme() + "://" + "1-0.oparl." + systemURI.getHost() + systemURI.getPath());
            system = systemRepository.findOne(systemURI);
        }
        entity.setSystem(system);
        return entity;
    }
}
