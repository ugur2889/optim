package com.example.microservice.userservice.repository;

import com.example.microservice.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User,Long> {
}
