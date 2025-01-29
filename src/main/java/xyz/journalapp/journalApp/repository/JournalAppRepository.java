package xyz.journalapp.journalApp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import xyz.journalapp.journalApp.entity.JournalEntry;


public interface JournalAppRepository extends MongoRepository<JournalEntry, ObjectId> {


}
