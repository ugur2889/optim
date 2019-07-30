package com.example.microservice.noteservice.service;

import com.example.microservice.noteservice.entity.Note;
import com.example.microservice.noteservice.repository.NoteRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    NoteRepository noteRepository;

    public List<Note> getAllNotes(){
        return noteRepository.findAll();
    }

    public Note saveNote(Note note){
        return noteRepository.save(note);
    }

    public void deleteById(Long id) throws NotFoundException {
        if(id ==null){
            throw new NotFoundException("NoteId is not defined");

        }
        noteRepository.deleteById(id);
    }
}
