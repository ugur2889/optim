package com.example.microservice.emailservice.repository;

import com.example.microservice.emailservice.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmailRepository extends MongoRepository<Email,Long> {
}
