package com.example.microservice.userservice.service;

import com.example.microservice.userservice.entity.User;
import com.example.microservice.userservice.repository.UserRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
    return userRepository.findAll();

    }

    public User saveUser(User user) {
        return userRepository.save(user);

    }

    public void deleteById(Long id) throws  NotFoundException{
        if(id ==null){
            throw new NotFoundException("UserId is not defined");

        }
        userRepository.deleteById(id);
    }


}
