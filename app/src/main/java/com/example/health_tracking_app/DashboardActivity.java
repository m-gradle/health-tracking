package com.example.health_tracking_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {

    private Button workoutTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout = new FrameLayout(this);
        setContentView(frameLayout);

        LayoutInflater inflater = LayoutInflater.from(this);
        View childView = inflater.inflate(R.layout.activity_dashboard, frameLayout, false);
        frameLayout.addView(childView);

        workoutTracker = findViewById(R.id.workoutButton);

        workoutTracker.setOnClickListener(v -> {

            Toast.makeText(DashboardActivity.this, "Going to workout", Toast.LENGTH_LONG).show();
            startActivity(new Intent(DashboardActivity.this, InputWorkoutActivity.class));
        });
    }



}