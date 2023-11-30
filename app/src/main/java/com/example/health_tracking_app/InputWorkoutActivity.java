package com.example.health_tracking_app;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


// InputWorkoutActivity.java
public class InputWorkoutActivity extends AppCompatActivity {

    private EditText editTextSets, editTextReps, editTextWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout = new FrameLayout(this);
        setContentView(frameLayout);

        LayoutInflater inflater = LayoutInflater.from(this);
        View childView = inflater.inflate(R.layout.activity_input_workout, frameLayout, false);
        frameLayout.addView(childView);

        editTextSets = findViewById(R.id.editTextSets);
        editTextReps = findViewById(R.id.editTextReps);
        editTextWeight = findViewById(R.id.editTextWeight);

        Button buttonSave = findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveWorkout();
            }
        });
    }

    private void saveWorkout() {
        // Retrieve input values
        String sets = editTextSets.getText().toString();
        String reps = editTextReps.getText().toString();
        String weight = editTextWeight.getText().toString();


        Log.d("WorkoutDetails", "Sets: " + sets + ", Reps: " + reps + ", Weight: " + weight);
        Toast.makeText(InputWorkoutActivity.this, "Workouts saved", Toast.LENGTH_LONG).show();

        finish();

    }
}
