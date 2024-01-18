package com.project.taskmanagement.controller;

import com.project.taskmanagement.model.User;
import com.project.taskmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String home(){
        return "<h1>Welcome home!</h1>";
    }

    @GetMapping("/user")
    public String user(Authentication authentication){
        return "<h1>Welcome "+authentication.getName()+"!</h1>";
    }

    @GetMapping("/admin")
    public String admin(Authentication authentication){
        return "<h1>Welcome "+authentication.getName()+"!</h1>";
    }

    @GetMapping("/users")
    public String displayAllUsers(Authentication authentication){
        return "Users list will be returned here.";
    }

    @PostMapping("/users/add-user")
    public User saveUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
