package com.example.locationtracker;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

// Location Dao for the Adding data

@Dao
public interface LocationDao {

    @Insert
    void insert(Location_Coordinates location_coordinates);

    @Query("SELECT * FROM location_table")
    List<Location_Coordinates> getLocations();



}
