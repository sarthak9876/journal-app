package xyz.journalapp.journalApp.repository;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.repository.MongoRepository;
import xyz.journalapp.journalApp.api.response.NykaaResponse;
import xyz.journalapp.journalApp.entity.Nykaa;
import xyz.journalapp.journalApp.service.NykaaService;


public interface NykaaRepository extends MongoRepository<Nykaa, String> {

//    Nykaa findByQuery(String query);
}
