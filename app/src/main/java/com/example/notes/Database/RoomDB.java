package com.example.notes.Database;

import androidx.room.Database;

import com.example.notes.Models.Notes;

@Database(entities = Notes.class, version = 1,exportSchema = false)
public class RoomDB {
    private static RoomDB database;
}
