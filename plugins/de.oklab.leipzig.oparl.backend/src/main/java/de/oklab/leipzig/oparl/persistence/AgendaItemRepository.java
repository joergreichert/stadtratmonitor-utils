package de.oklab.leipzig.oparl.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import de.oklab.leipzig.oparl.entities.AgendaItem;

public interface AgendaItemRepository extends MongoRepository<AgendaItem, String> {

}
