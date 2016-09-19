package de.oklab.leipzig.oparl.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import de.oklab.leipzig.oparl.entities.Membership;

public interface MembershipRepository extends MongoRepository<Membership, String> {

}
