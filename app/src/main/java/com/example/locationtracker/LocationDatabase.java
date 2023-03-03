package com.example.locationtracker;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

// Database for the Storing Location

@Database(entities = {Location_Coordinates.class},version = 1,exportSchema = false)
public abstract class LocationDatabase extends RoomDatabase {

    public static LocationDatabase instance;

    public abstract LocationDao locationDao();

    public static LocationDatabase getInstance(Context context){
        if(instance==null){
            instance = Room.databaseBuilder(context,LocationDatabase.class,"location_database")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;

    }



}
