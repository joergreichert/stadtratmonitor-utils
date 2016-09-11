package de.oklab.leipzig.oparl.persistence.impl;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.util.CloseableIterator;
import org.springframework.stereotype.Repository;

import de.oklab.leipzig.oparl.entities.Body;
import de.oklab.leipzig.oparl.entities.Consultation;
import de.oklab.leipzig.oparl.entities.Meeting;
import de.oklab.leipzig.oparl.persistence.OParlRepository;

@Repository("oparlRepository")
public class OParlRepositoryImpl implements OParlRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public CloseableIterator<Meeting> getMeetings() {
        Criteria criteria = new Criteria();
        Query query = Query.query(criteria);
        return mongoTemplate.stream(query, Meeting.class);
    }

    @Override
    public List<Consultation> getConsultations(Meeting meeting) {
        Criteria criteria = Criteria.where("created").gte(meeting.getStart()).lte(meeting.getEnd());
        Query query = Query.query(criteria);
        return mongoTemplate.find(query, Consultation.class);
    }

    @Override
    public List<Consultation> getConsultations() {
        Criteria criteria = new Criteria();
        Query query = Query.query(criteria);
        return mongoTemplate.find(query, Consultation.class);
    }

    @Override
    public Body findBodyByURI(URI uri) {
        Criteria criteria = Criteria.where("_id.path").is(uri.getPath());
        Query query = Query.query(criteria);
        return mongoTemplate.findOne(query, Body.class);
    }
}
