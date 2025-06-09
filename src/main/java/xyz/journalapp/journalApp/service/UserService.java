package xyz.journalapp.journalApp.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import xyz.journalapp.journalApp.entity.JournalEntry;
import xyz.journalapp.journalApp.entity.User;
import xyz.journalapp.journalApp.repository.JournalAppRepository;
import xyz.journalapp.journalApp.repository.UserRepository;

import java.util.List;
import java.util.Optional;


@Component
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveEntry(User user) {
        userRepository.save(user);
    }

    public void saveAll(List<User> users) {
        userRepository.saveAll(users);
    }
    public List<User> getAll() {
        return userRepository.findAll();
    }


    public Optional<User> findById(ObjectId id) {
        return userRepository.findById(id);
    }

    public void deleteEntry(ObjectId id) {
        userRepository.deleteById(id);
    }



    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }


//    public Optional<User> findById(ObjectId id) {
//        return userRepository.findById(id);
//    }



    }
