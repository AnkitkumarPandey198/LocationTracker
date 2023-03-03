package com.example.locationtracker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

// Adapter for showing data in recyclerView

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder>{

    private List<Location_Coordinates> mLocations = new ArrayList<>();

    public void setLocations(List<Location_Coordinates> locations) {
        mLocations = locations;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public LocationAdapter.LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.coordinates_item_row, parent, false);
        return new LocationViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull LocationAdapter.LocationViewHolder holder, int position) {
        Location_Coordinates location = mLocations.get(position);
        holder.latitudeTextView.setText(String.valueOf(location.getLatitude()));
        holder.longitudeTextView.setText(String.valueOf(location.getLongitude()));
        holder.addressTextView.setText(location.getAddress());

    }

    @Override
    public int getItemCount() {
        return mLocations.size();
    }

    public class LocationViewHolder extends RecyclerView.ViewHolder {
        private TextView latitudeTextView;
        private TextView longitudeTextView;
        private TextView addressTextView;
        public LocationViewHolder(@NonNull View itemView) {
            super(itemView);
            latitudeTextView = itemView.findViewById(R.id.tv_latitude_value);
            longitudeTextView = itemView.findViewById(R.id.tv_longitude_value);
            addressTextView = itemView.findViewById(R.id.tv_Address_value);
        }
    }
}
