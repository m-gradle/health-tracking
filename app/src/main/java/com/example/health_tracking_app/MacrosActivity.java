package com.example.health_tracking_app;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MacrosActivity extends AppCompatActivity {

    private EditText etTotalFat, etSodium, etTotalCarbs, etTotalSugar, etFiber, etProtein;
    private TextView tvStoredData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macros);

        etTotalFat = findViewById(R.id.etTotalFat);
        etSodium = findViewById(R.id.etSodium);
        etTotalCarbs = findViewById(R.id.etTotalCarbs);
        etTotalSugar = findViewById(R.id.etTotalSugar);
        etFiber = findViewById(R.id.etFiber);
        etProtein = findViewById(R.id.etProtein);
        Button btnSave = findViewById(R.id.btnSave);
        tvStoredData = findViewById(R.id.tvStoredData);

        // Placeholder to display stored data (0 for each nutrient initially)
        displayStoredData();

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveMacros();
            }
        });
    }

    private void saveMacros() {
        // Retrieve user-entered values
        String totalFat = etTotalFat.getText().toString().trim();
        String sodium = etSodium.getText().toString().trim();
        String totalCarbs = etTotalCarbs.getText().toString().trim();
        String totalSugar = etTotalSugar.getText().toString().trim();
        String fiber = etFiber.getText().toString().trim();
        String protein = etProtein.getText().toString().trim();

        // TODO: Save these values to Firebase database

        // Placeholder for displaying a toast indicating successful data entry
        // You can remove this when Firebase implementation is in place
        // For now, update the stored data shown on the screen
        displayStoredData();

        finish();
    }

    private void displayStoredData() {
        // Placeholder to display stored data (0 for each nutrient initially)
        String storedData = "Stored Data:\n" +
                "Total Fat: 0\n" +
                "Sodium: 0\n" +
                "Total Carbs: 0\n" +
                "Total Sugar: 0\n" +
                "Fiber: 0\n" +
                "Protein: 0";

        // Update the TextView with stored data
        tvStoredData.setText(storedData);
    }
}
