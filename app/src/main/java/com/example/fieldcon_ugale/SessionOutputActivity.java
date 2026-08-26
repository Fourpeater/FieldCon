package com.example.fieldcon_ugale;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

/**
 * Session result screen. The layout is entirely declarative — the thermal card, the light
 * timeline and the recommended windows are all defined in activity_session_output.xml — so this
 * class only shows it and handles the back arrow.
 */
public class SessionOutputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session_output);

        ((Toolbar) findViewById(R.id.toolbar)).setNavigationOnClickListener(v -> finish());
    }
}
