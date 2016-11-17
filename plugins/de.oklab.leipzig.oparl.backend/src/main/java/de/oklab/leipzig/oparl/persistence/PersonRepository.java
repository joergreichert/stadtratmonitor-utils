package de.oklab.leipzig.oparl.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import de.oklab.leipzig.oparl.entities.Person;

public interface PersonRepository extends MongoRepository<Person, String> {

}
