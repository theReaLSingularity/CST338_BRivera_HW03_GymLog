package com.example.cst338_brivera_hw03_gymlog.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Entity;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.cst338_brivera_hw03_gymlog.database.entities.User;

import java.util.List;

@Dao
public interface UserDAO {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insert (User... user);

    @Delete
    void delete(User user);

    @Query("SELECT * FROM " + GymLogDatabase.USER_TABLE + " ORDER BY username")
    List<User> getAllUsers();

    @Query("DELETE FROM " + GymLogDatabase.USER_TABLE)
    void deleteAll();
}
