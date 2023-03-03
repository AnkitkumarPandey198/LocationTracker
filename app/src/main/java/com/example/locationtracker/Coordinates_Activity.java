package com.example.locationtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

//showing recyclerView in the Activity

public class Coordinates_Activity extends AppCompatActivity {
    List<Location_Coordinates> locations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinates);

        RecyclerView mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        LocationAdapter mAdapter = new LocationAdapter();
        locations = LocationDatabase.getInstance(this).locationDao().getLocations();
        mAdapter.setLocations(locations);
        mRecyclerView.setAdapter(mAdapter);
    }

}