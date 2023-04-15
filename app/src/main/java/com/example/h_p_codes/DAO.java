package com.example.h_p_codes;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DAO {
    @Query("SELECT * FROM Entry")
    List<Entry> all();
}
