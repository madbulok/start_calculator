package com.uzlov.client;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private final String KEY = "PARAM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton button = findViewById(R.id.btnStartCalculator);
        button.setOnClickListener(v -> {
            Uri uri = Uri.parse("example://intent");
            Intent runCalc = new Intent(Intent.ACTION_VIEW, uri);
            runCalc.putExtra(KEY,"11\n+\n22\n=\n33");
            startActivity(runCalc);
        });
    }
}