package com.codecool.coolnote.controller;

import com.codecool.coolnote.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final NoteService noteService;

    @Autowired
    public IndexController(NoteService noteService) {
        this.noteService = noteService;
    }

    @RequestMapping({"/", "", "/index"})
    public String getIndex(Model model) {
        model.addAttribute("notes",noteService.getAllNotes());
        model.addAttribute("noteCounter", noteService.countNotes());
        return "index";
    }
}
