package com.example.myapp.DB;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.myapp.PharmacyLog;

@Database(entities = {PharmacyLog.class}, version = 1)

public abstract class AppDataBase extends RoomDatabase {
    public static final String DATABASE_NAME = "PharmacyLog.db";
    public static final String PHARMACYLOG_TABLE = "pharmacylog_table";

    private static volatile AppDataBase instance;

    private static final Object LOCK = new Object();

    public static AppDataBase getInstance(Context context){
        if(instance == null){
            synchronized (LOCK){
                if(instance == null){
                    instance = Room.databaseBuilder(context.getApplicationContext(),
                            AppDataBase.class,
                            DATABASE_NAME).build();
                }
            }
        }
        return instance;
    }
}
