package com.example.fieldcon_ugale;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

/**
 * Session input screen. The layout is entirely declarative; this class only shows it and moves
 * between screens.
 */
public class SessionInputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session_input);

        ((Toolbar) findViewById(R.id.toolbar)).setNavigationOnClickListener(v -> finish());
        findViewById(R.id.buttonCompute).setOnClickListener(
                v -> startActivity(new Intent(this, SessionOutputActivity.class)));
    }
}
