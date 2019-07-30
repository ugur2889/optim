package com.example.microservice.emailservice.controller;

import com.example.microservice.emailservice.entity.Email;
import com.example.microservice.emailservice.repository.EmailRepository;
import com.example.microservice.emailservice.service.EmailService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmailController {

    @Autowired
    EmailService emailService;

    @GetMapping(path="/emails")
    public List<Email> getEmails(){
        return emailService.getAllEmails();
    }

    @PostMapping(path="/emails")
    public String saveUser(@RequestBody Email email){
        emailService.saveEmail(email);
        return "Added usersw with id : " + email.getId();
    }

    @DeleteMapping(path="/users/{id}")
    public void deleteUser(@PathVariable Long id) throws NotFoundException {
        emailService.deleteById(id);

    }
}
