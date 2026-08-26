package com.example.fieldcon_ugale;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Home screen. The layout is entirely declarative; this class only shows it and moves to the
 * screen whose button was pressed.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonNewSession).setOnClickListener(
                v -> startActivity(new Intent(this, SessionInputActivity.class)));
        findViewById(R.id.buttonSavedLocations).setOnClickListener(
                v -> startActivity(new Intent(this, SavedLocationsActivity.class)));
        findViewById(R.id.buttonSavedRecords).setOnClickListener(
                v -> startActivity(new Intent(this, SavedRecordsActivity.class)));
    }
}
