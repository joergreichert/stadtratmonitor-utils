package de.oklab.leipzig.oparl.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import de.oklab.leipzig.oparl.entities.Consultation;

public interface ConsultationRepository extends MongoRepository<Consultation, String> {

}
