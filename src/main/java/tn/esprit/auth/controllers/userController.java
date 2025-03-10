package tn.esprit.auth.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.auth.entities.User;
import tn.esprit.auth.services.userService;
import java.util.List;
@RestController
@RequestMapping("/api/user")
public class userController {
    private final userService userService;

    public userController(userService userService) {
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public User createUser (@RequestBody User user) {
        return userService.saveUser(user);
    }
    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser (@PathVariable long id) {
        userService.deleteUser(id);
    }

    @GetMapping("/getbyid/{id}")
    public User getUserById(@PathVariable long id) {
        return userService.getUser(id);
    }

    @GetMapping ("/getall")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/updateUser/{id}")
    public User updateUser (@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return userService.saveUser(user);
    }
}











