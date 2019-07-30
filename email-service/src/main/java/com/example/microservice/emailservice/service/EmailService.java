package com.example.microservice.emailservice.service;

import com.example.microservice.emailservice.entity.Email;
import com.example.microservice.emailservice.repository.EmailRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    public List<Email> getAllEmails(){
        return emailRepository.findAll();
    }


    public Email saveEmail(Email email) {
        return emailRepository.save(email);

    }

    public void deleteById(Long id) throws NotFoundException {
        if(id ==null){
            throw new NotFoundException("EmailId is not defined");

        }
        emailRepository.deleteById(id);
    }


}
