package com.codecool.coolnote.model;


import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Note {

    private String message;

    public Note(String message) {
        this.message = message;
    }
}
