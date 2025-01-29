package xyz.journalapp.journalApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.journalapp.journalApp.entity.User;
import xyz.journalapp.journalApp.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        List<User> users = userService.getAll();
        if(users!=null && !users.isEmpty()) {
            return new ResponseEntity<>(users, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        try{
            userService.saveEntry(user);
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }
        catch(Exception e){
            e.getStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping
    public ResponseEntity<?> updateUser(@RequestBody User user) {

        List<User> userInDb = userService.findByUsername(user);
        if(userInDb!=null && !userInDb.isEmpty()) {

            return new ResponseEntity<>(HttpStatus.OK);
        }
        //;
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

//    @GetMapping("/id/{myId}")
//    public ResponseEntity<User> getEntry(@PathVariable ObjectId myId) {
//
//        Optional<User> userEntry = UserService.findById(myId);
//        if (userEntry.isPresent()) {
//            return new ResponseEntity<>(User.get(), HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }

}
