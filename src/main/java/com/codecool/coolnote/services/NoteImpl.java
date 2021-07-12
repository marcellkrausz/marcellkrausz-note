package com.codecool.coolnote.services;

import com.codecool.coolnote.model.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteImpl implements NoteService {

    private final List<Note> notes;

    public NoteImpl() {
        this.notes = new ArrayList<>();
        this.notes.add(new Note("Don't forget the ...."));
        this.notes.add(new Note("19:30 meeting"));
    }

    @Override
    public int countNotes() {
        return this.notes.size();
    }

    @Override
    public void addNote(String message) {
        notes.add(new Note(message));
    }

    @Override
    public List<Note> getAllNotes() {
        return this.notes;
    }
}
