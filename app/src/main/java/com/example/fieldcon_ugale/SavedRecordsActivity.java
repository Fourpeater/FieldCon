package com.example.fieldcon_ugale;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

/**
 * Saved records screen. The layout is entirely declarative — the record cards, their heat
 * category badges and their approve / deny stamps are all defined in
 * activity_saved_records.xml — so this class only shows it and handles the back arrow.
 */
public class SavedRecordsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_records);

        ((Toolbar) findViewById(R.id.toolbar)).setNavigationOnClickListener(v -> finish());
    }
}
