package com.example.microservice.noteservice.controller;

import com.example.microservice.noteservice.entity.Note;
import com.example.microservice.noteservice.service.NoteService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {

    @Autowired
    NoteService noteService;

    @GetMapping(path="/notes")
    public List<Note> getNotes(){
          return noteService.getAllNotes();
    }

    @PostMapping(path="/notes")
    public String saveUser(@RequestBody Note note){
        noteService.saveNote(note);
        return "Added usersw with id : " + note.getId();
    }

    @DeleteMapping(path="/notes/{id}")
    public void deleteUser(@PathVariable Long id) throws NotFoundException {
        noteService.deleteById(id);

    }
}
