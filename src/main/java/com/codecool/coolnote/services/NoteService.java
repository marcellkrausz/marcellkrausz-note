package com.codecool.coolnote.services;

import com.codecool.coolnote.model.Note;

import java.util.List;

public interface NoteService {

    void addNote(String message);

    int countNotes();

    List<Note> getAllNotes();
}
