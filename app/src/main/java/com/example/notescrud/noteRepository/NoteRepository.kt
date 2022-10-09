package com.example.notescrud.noteRepository

import androidx.lifecycle.LiveData
import com.example.notescrud.dao.NotesDao
import com.example.notescrud.entityNote.Note

class NoteRepository(private val notesDao: NotesDao) {


    val allNotes: LiveData<List<Note>> = notesDao.getAllNotes()

    suspend fun insert(note: Note) {
        notesDao.insert(note)
    }

    suspend fun delete(note: Note) {
        notesDao.delete(note)
    }

    suspend fun update(note: Note) {
        notesDao.update(note)
    }
}