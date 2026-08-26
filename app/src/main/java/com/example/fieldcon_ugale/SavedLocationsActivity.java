package com.example.fieldcon_ugale;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

/**
 * Saved locations screen. The layout is entirely declarative — the location cards and the
 * add-location form are all defined in activity_saved_locations.xml — so this class only shows it
 * and handles the back arrow.
 */
public class SavedLocationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_locations);

        ((Toolbar) findViewById(R.id.toolbar)).setNavigationOnClickListener(v -> finish());
    }
}
