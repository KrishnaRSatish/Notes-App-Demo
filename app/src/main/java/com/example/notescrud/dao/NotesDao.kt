package com.example.notescrud.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.notescrud.entityNote.Note

@Dao
interface NotesDao {

    // adding a new entry to our database.
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(note :Note)


    // for deleting our note.
    @Delete
    fun delete(note: Note)

    @Query("Select * from notesTable order by id ASC")
    fun getAllNotes(): LiveData<List<Note>>

    // update the note.
    @Update
    fun update(note: Note)

}
