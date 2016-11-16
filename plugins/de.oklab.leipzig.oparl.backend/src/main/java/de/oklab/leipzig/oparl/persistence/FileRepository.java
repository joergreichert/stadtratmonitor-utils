package de.oklab.leipzig.oparl.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import de.oklab.leipzig.oparl.entities.File;

public interface FileRepository extends MongoRepository<File, String> {

}
