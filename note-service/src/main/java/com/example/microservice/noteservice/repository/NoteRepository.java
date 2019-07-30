package com.example.microservice.noteservice.repository;

import com.example.microservice.noteservice.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note, Long> {
}
