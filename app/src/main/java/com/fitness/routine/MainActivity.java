package com.fitness.routine;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGetApp = findViewById(R.id.btn_get_app);
        if (btnGetApp != null) {
            btnGetApp.setOnClickListener(v -> {
                Toast.makeText(this, "Demo: Full workout list would load here!", Toast.LENGTH_LONG).show();
            });
        }
    }
}