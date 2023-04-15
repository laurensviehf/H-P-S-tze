package com.example.h_p_codes;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

import java.util.Objects;

@Database(entities = {Entry.class},version = 1)
public abstract class DB extends RoomDatabase {
    public abstract DAO dao();

    private static DB db;

    public static DB getInstance(){
        Objects.nonNull(db);
        return db;
    }

    public static void build(@NonNull Context c){
        db = Room.databaseBuilder(c,DB.class,"cock").allowMainThreadQueries().build();
    }

}
