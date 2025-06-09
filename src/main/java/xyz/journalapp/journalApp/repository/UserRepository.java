package xyz.journalapp.journalApp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import xyz.journalapp.journalApp.entity.JournalEntry;
import xyz.journalapp.journalApp.entity.User;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends MongoRepository<User, ObjectId> {

        User findByUserName(String userName);


}