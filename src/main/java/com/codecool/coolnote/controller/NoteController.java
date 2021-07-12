package com.codecool.coolnote.controller;
;
import com.codecool.coolnote.commands.NoteCommand;
import com.codecool.coolnote.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NoteController {

    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }


    @GetMapping("/notes")
    public String newNotes(Model model) {
        model.addAttribute("note",new NoteCommand());
        return "notes";
    }

    @PostMapping("/notes")
    public String save(@ModelAttribute NoteCommand command) {
        this.noteService.addNote(command.getMessage());
        return "redirect:/index";
    }
}
