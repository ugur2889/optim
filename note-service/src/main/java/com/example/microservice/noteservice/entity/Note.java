package com.example.microservice.noteservice.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//@Entity
@Document(collection = "Note")
public class Note {

    @Id
    private String id;
    private String caption;
    private String userNotes;

    public Note() {
    }

    public Note(String id, String caption, String userNotes) {
        this.id = id;
        this.caption = caption;
        this.userNotes = userNotes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getUserNotes() {
        return userNotes;
    }

    public void setUserNotes(String userNotes) {
        this.userNotes = userNotes;
    }


    @Override
    public String toString() {
        return "Note{" +
                "id='" + id + '\'' +
                ", caption='" + caption + '\'' +
                ", userNotes='" + userNotes + '\'' +
                '}';
    }
}
