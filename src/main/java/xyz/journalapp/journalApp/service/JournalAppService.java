package xyz.journalapp.journalApp.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import xyz.journalapp.journalApp.entity.JournalEntry;
import xyz.journalapp.journalApp.repository.JournalAppRepository;

import java.util.List;
import java.util.Optional;


@Component
public class JournalAppService {

    @Autowired
    private JournalAppRepository journalAppRepository ;

    public void saveEntry(JournalEntry entry) {
        journalAppRepository.save(entry);
    }
    public List<JournalEntry> getAll() {
        return journalAppRepository.findAll();
    }

    public Optional<JournalEntry> findById(ObjectId id) {
        return journalAppRepository.findById(id);
    }

    public void deleteEntry(ObjectId id) {
        journalAppRepository.deleteById(id);
    }


    }
