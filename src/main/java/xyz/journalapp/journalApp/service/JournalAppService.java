package xyz.journalapp.journalApp.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import xyz.journalapp.journalApp.entity.JournalEntry;
import xyz.journalapp.journalApp.entity.User;
import xyz.journalapp.journalApp.repository.JournalAppRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Component
public class JournalAppService {

    @Autowired
    private JournalAppRepository journalAppRepository ;

    @Autowired
    private UserService userService;

    @Transactional
    public void saveEntry(JournalEntry entry, String userName) {
        try{
            User user = userService.findByUserName(userName);
            entry.setDate(LocalDateTime.now());
            JournalEntry saved =journalAppRepository.save(entry);
            user.getJournalEntries().add(saved);
            //user.setUserName(null);
            userService.saveEntry(user);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Some went wrong while saving the entry:",e);
        }

    }

    public void saveEntry(JournalEntry entry) {
        journalAppRepository.save(entry);
    }

    public List<JournalEntry> getAll() {
        return journalAppRepository.findAll();
    }

    public Optional<JournalEntry> findById(ObjectId id) {
        return journalAppRepository.findById(id);
    }

    public void deleteEntry(ObjectId id, String userName) {
        User user = userService.findByUserName(userName);
        user.getJournalEntries().removeIf(entry -> entry.getId().equals(id));
        userService.saveEntry(user);
        journalAppRepository.deleteById(id);

    }


    }
