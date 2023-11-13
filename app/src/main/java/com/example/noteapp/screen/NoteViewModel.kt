package com.example.noteapp.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import com.example.noteapp.data.NoteDataSource
import com.example.noteapp.model.Note

class NoteViewModel : ViewModel() {
    val noteList = mutableStateListOf<Note>()

    init {
        noteList.addAll(NoteDataSource().loadNotes())
    }

    fun addNote(note:Note){
        noteList.add(note)
    }
    fun removeNote(note:Note){
        noteList.remove(note)
    }
    fun getAlNotes(): List<Note>{
        return noteList
    }
}