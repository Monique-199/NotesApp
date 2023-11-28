package com.example.myquicknotes;

import android.os.Bundle;

import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    private Switch darkModeSwitch;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Initialize views
        darkModeSwitch = findViewById(R.id.darkModeSwitch);
        logoutButton = findViewById(R.id.logoutButton);

        // Set Dark Mode Switch listener
        darkModeSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // Apply Dark Mode theme
                applyDarkMode();
            } else {
                // Apply Light Mode theme
                applyLightMode();
            }
        });

        // Set logoutButton click listener
        logoutButton.setOnClickListener(v -> performLogout());
    }

    private void applyDarkMode() {
        // Implement logic to switch to Dark Mode
        Toast.makeText(this, "Dark Mode Enabled", Toast.LENGTH_SHORT).show();
        // Apply Dark Mode theme or change UI accordingly
    }

    private void applyLightMode() {
        // Implement logic to switch to Light Mode
        Toast.makeText(this, "Light Mode Enabled", Toast.LENGTH_SHORT).show();
        // Apply Light Mode theme or change UI accordingly
    }

    private void performLogout() {
        // Implement logic to logout the user
        // Clear user sessions, navigate to login screen, etc.
        Toast.makeText(this, "Logged out", Toast.LENGTH_SHORT).show();
        // Navigate to login screen or perform logout actions
    }
}
