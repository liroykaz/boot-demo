package com.skillbox.test.skillboxdemo.repository;

import com.skillbox.test.skillboxdemo.model.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * NoteRepository - is a repository that implements the Spring Data functionality
 * @author Pavel Lebedev
 */

@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {

}
