package com.skillbox.test.skillboxdemo.service;

import com.skillbox.test.skillboxdemo.model.Note;

import java.util.List;

/**
 * NoteService is a service that provides functionality for using the repository for the Note entity
 * @author Pavel Lebedev
 */

public interface NoteService {

    void addNote(String text);

    List<Note> findAll();
}
