package de.oklab.leipzig.oparl.persistence;

import java.net.URI;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SystemRepository extends MongoRepository<de.oklab.leipzig.oparl.entities.System, URI> {

}
