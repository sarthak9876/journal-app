package xyz.journalapp.journalApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.journalapp.journalApp.service.NykaaService;

@RestController
@RequestMapping("/nykaa")
public class NykaaController {

    @Autowired
    private NykaaService nykaaService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return nykaaService.fetchNykaaData();
    }



}
