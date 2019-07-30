package com.example.microservice.userservice.controller;

import com.example.microservice.userservice.entity.User;
import com.example.microservice.userservice.service.UserService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping(path="/users")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping(path="/users")
    public String saveUser(@RequestBody User user){
        userService.saveUser(user);
        return "Added usersw with id : " + user.getId();
    }

    @DeleteMapping(path="/users/{id}")
    public void deleteUser(@PathVariable Long id) throws NotFoundException {
        userService.deleteById(id);

    }
}
