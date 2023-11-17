package com.example.myapp.DB;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

import com.example.myapp.PharmacyLog;

@Dao
public interface PharmacyDAO {
    @Insert
    void insert(PharmacyLog...pharmacyLogs);

    @Update
    Void update(PharmacyLog...pharmacyLogs);

    @Delete
    void delete(PharmacyLog pharmacyLog);

}
