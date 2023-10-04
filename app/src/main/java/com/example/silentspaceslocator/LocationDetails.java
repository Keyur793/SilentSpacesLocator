package com.example.silentspaceslocator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class LocationDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_details);

        Button buttonBack = findViewById(R.id.btnback);

        TextView locationName = findViewById(R.id.txtlocationName);
        TextView latitude = findViewById(R.id.txtLatitude);
        TextView longitude = findViewById(R.id.txtLongitude);
        TextView address = findViewById(R.id.txtaddress);

        Location clickedLocation = getIntent().getParcelableExtra("location_object");
        System.out.println(clickedLocation.getName());

        buttonBack.setOnClickListener(v -> { // goes back to the ListViewActivity Page
            // Create an Intent to start the new activity
            Intent intent = new Intent(LocationDetails.this, ListViewActivity.class);
            startActivity(intent);
        });
        String fullAddress = clickedLocation.getAddress() + ", " + clickedLocation.getCity()  + ", " + clickedLocation.getState() + ", " + clickedLocation.getCountry() + ", " + clickedLocation.getPostalCode();
        // Combine into One long address.

        // Displays the information
        locationName.setText(clickedLocation.getName());
        latitude.setText(String.valueOf(clickedLocation.getLatitude()));
        longitude.setText(String.valueOf(clickedLocation.getLongitude()));
        address.setText(fullAddress);


    }
}