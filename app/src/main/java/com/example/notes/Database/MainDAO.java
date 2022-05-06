package com.example.notes.Database;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.notes.Models.Notes;

import java.util.List;

@Dao
public class MainDAO {
    @Insert(onConflict = REPLACE)
    void insert(Notes notes) {
    }

    @Query("SELECT * FROM notes ORDER BY id DESC")
    public List<Notes> getAll() {
        return null;
    }

    @Query("Update notes Set title=:title, notes =:notes where ID = :id")
    void Update(int id, String title, String notes) {
    }

    @Delete
    void delete(Notes notes) {
    }
}
