package com.example.silentspaceslocator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSwitchActivity = findViewById(R.id.buttonSwitchActivity);
        buttonSwitchActivity.setOnClickListener(v -> {
            // Create an Intent to start the new activity
            Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
            startActivity(intent);
        });
    }
}
