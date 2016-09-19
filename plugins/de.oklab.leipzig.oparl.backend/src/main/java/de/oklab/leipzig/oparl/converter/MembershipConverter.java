package de.oklab.leipzig.oparl.converter;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import de.oklab.leipzig.oparl.entities.Body;
import de.oklab.leipzig.oparl.entities.Organization;
import de.oklab.leipzig.oparl.persistence.OParlRepository;
import de.oklab.leipzig.oparl.service.model.Membership;

@Component
public class MembershipConverter implements Converter<Membership, de.oklab.leipzig.oparl.entities.Membership> {

    @Autowired
    private OParlRepository oParlRepository;

    private Map<URI, de.oklab.leipzig.oparl.entities.Body> bodies = new HashMap<>();
    private Map<URI, de.oklab.leipzig.oparl.entities.Organization> organizations = new HashMap<>();

    @Override
    public de.oklab.leipzig.oparl.entities.Membership convert(Membership source) {
        de.oklab.leipzig.oparl.entities.Membership entity = new de.oklab.leipzig.oparl.entities.Membership();
        entity.setCreated(source.getCreated());
        entity.setModified(source.getModified());
        entity.setPolitikBeiUnsOriginalId(source.getOriginalId());
        entity.setStart(source.getStartDate());
        entity.setEnd(source.getEndDate());
        entity.setRole(source.getRole());
        URI bodyURI = source.getBody();
        Body body = null;
        if (!bodies.containsKey(bodyURI)) {
            body = oParlRepository.findBodyByURI(bodyURI);
            bodies.put(bodyURI, body);
        } else {
            body = bodies.get(bodyURI);
        }
        entity.setBody(body);
        URI organizationURI = source.getOrganization();
        Organization organization = null;
        if (!organizations.containsKey(organizationURI)) {
            organization = oParlRepository.findOrganizationByURI(organizationURI);
            organizations.put(organizationURI, organization);
        } else {
            organization = organizations.get(organizationURI);
        }
        entity.setOrganization(organization);
        // TODO set person
        entity.setOriginalId(source.getId());
        return entity;
    }
}
