package com.redis.Redis.controllers;

import com.redis.Redis.models.User;
import com.redis.Redis.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RedisController {

    private final UserService userService;

    public RedisController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/save-user")
    public ResponseEntity<String> saveUser(User user){
        boolean result = userService.saveUser(user);

        if(result){
            return ResponseEntity.ok("User has been saved successfully.");
        }
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping("/get-users")
    public ResponseEntity<List<User>> fetchAllUsers(){

        List<User> users = userService.fetchAllUsers();

        return ResponseEntity.ok(users);
    }
}
