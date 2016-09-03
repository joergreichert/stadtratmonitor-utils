package de.oklab.leipzig.oparl.persistence;

import java.net.URI;

import org.springframework.data.mongodb.repository.MongoRepository;

import de.oklab.leipzig.oparl.entities.Meeting;

public interface MeetingRepository extends MongoRepository<Meeting, URI> {

}
