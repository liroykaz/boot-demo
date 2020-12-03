package com.skillbox.test.skillboxdemo.service;

import com.skillbox.test.skillboxdemo.model.Note;
import com.skillbox.test.skillboxdemo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteServiceBean implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public void addNote(String text) {
        Note note = new Note();
        note.setText(text);
        noteRepository.save(note);
    }

    @Override
    public List<Note> findAll() {
        List<Note> result = new ArrayList<>();
        noteRepository.findAll().forEach(result::add);
        return result;
    }
}
