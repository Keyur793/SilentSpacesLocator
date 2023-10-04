package com.example.silentspaceslocator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Color;


public class ListViewActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // Button to return to Home screen
        Button buttonBack = findViewById(R.id.button);
        buttonBack.setOnClickListener(v -> {
            finish(); // Close the current activity and go back to the previous one
        });

        LocationsList studyLocations = new LocationsList();
        studyLocations.populateLocations();

        // This will contain the list of Locations from db
        LinearLayout linearLayout = findViewById(R.id.linearLayout);

        for (Location location : studyLocations.getAllLocations()) {

            // Display location name
            TextView name = new TextView(this);
            name.setText(location.getName());
            name.setTextSize(30);
            name.setTypeface(null, Typeface.BOLD);
            LinearLayout.LayoutParams textParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT, // Width
                    LinearLayout.LayoutParams.WRAP_CONTENT  // Height
            );
            name.setLayoutParams(textParams);

            // Creating a button to let user see more details on a location
            Button moreButton = new Button(this);
            moreButton.setText("More Info");
            moreButton.setBackgroundColor(Color.parseColor("#FF3700B3"));
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    400, // Width
                    150  // Height
            );
            params.setMargins(0, 10,0,10);
            moreButton.setLayoutParams(params);
            moreButton.setTextColor(Color.WHITE);

            // Dividing line do separate each Location
            View divider = new View(this);
            divider.setBackgroundColor(Color.GRAY);
            LinearLayout.LayoutParams dividerParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, // Width
                    6  // Height
            );
            divider.setLayoutParams(dividerParams);

            // adds all items to the Display
            linearLayout.addView(name);
            linearLayout.addView(moreButton);
            linearLayout.addView(divider);

            moreButton.setOnClickListener(new View.OnClickListener() {
                //
                // TODO: When this button is clicked the screen should refresh
                //        user should be able to see full details of the location aka every
                //        variable from Location class. Add a back button
                //
                @Override
                public void onClick(View v) {
                    // Handle button click (if needed)
                    Intent intent = new Intent(getApplicationContext(), LocationDetails.class);
                    intent.putExtra("location_object", location); // helps pass data between activities
                    startActivity(intent); // sends Location object to the LocationDetails class with a key
                }
            });
        }
    }
}
