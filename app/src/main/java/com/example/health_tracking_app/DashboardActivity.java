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
    private Button foodButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout = new FrameLayout(this);
        setContentView(frameLayout);

        LayoutInflater inflater = LayoutInflater.from(this);
        View childView = inflater.inflate(R.layout.activity_dashboard, frameLayout, false);
        frameLayout.addView(childView);

        workoutTracker = findViewById(R.id.workoutButton);
        foodButton = findViewById(R.id.foodButton);

        workoutTracker.setOnClickListener(v -> {
            Toast.makeText(DashboardActivity.this, "Going to workout", Toast.LENGTH_LONG).show();
            startActivity(new Intent(DashboardActivity.this, InputWorkoutActivity.class));
        });
        foodButton.setOnClickListener(v -> {
            Toast.makeText(DashboardActivity.this, "Going to enter food", Toast.LENGTH_LONG).show();
            startActivity(new Intent(DashboardActivity.this, EnterFoodActivity.class));
        });
    }



}