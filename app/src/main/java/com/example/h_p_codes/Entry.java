package com.example.h_p_codes;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Entry {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public Entry(){
    }

    @ColumnInfo
    public String code;

    @ColumnInfo
    public String description;
}
