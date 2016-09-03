package de.oklab.leipzig.oparl.persistence;

import java.net.URI;

import org.springframework.data.mongodb.repository.MongoRepository;

import de.oklab.leipzig.oparl.entities.Organization;

public interface OrganizationRepository extends MongoRepository<Organization, URI> {

}
