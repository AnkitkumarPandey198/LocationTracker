package com.example.locationtracker;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

// location Entity

@Entity(tableName = "location_table")
public class Location_Coordinates {

    @PrimaryKey(autoGenerate = true)
    public int id;
    private double latitude;
    private double longitude;
    private String address;

    public Location_Coordinates(double latitude, double longitude, String address) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
