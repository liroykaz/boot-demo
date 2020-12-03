package com.skillbox.test.skillboxdemo.controllers;

import com.skillbox.test.skillboxdemo.model.Note;
import com.skillbox.test.skillboxdemo.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    private NoteService noteService;

    @GetMapping(value = {"/"})
    public String index(Model model) {
        Note note = new Note();
        model.addAttribute("note", note);
        return "index";
    }

    @PostMapping("/addNote")
    public String addNoteWithCheck(@Valid @ModelAttribute(name = "note") Note note, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            System.out.println("error!!!!!!");
            return "index";
        }

        noteService.addNote(note.getText());
        System.out.println(noteService.findAll());
        return "redirect:?success=Success! Congrats";
    }
}
