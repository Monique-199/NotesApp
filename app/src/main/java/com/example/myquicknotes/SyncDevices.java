package com.example.myquicknotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SyncDevices extends AppCompatActivity {

    private CheckBox syncAcrossDevicesCheckBox;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sync_devices);

        // Initialize views
        syncAcrossDevicesCheckBox = findViewById(R.id.syncAcrossDevicesCheckBox);
        logoutButton = findViewById(R.id.logoutButton);

        // Set click listener for syncAcrossDevicesCheckBox
        syncAcrossDevicesCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement logic for syncing across devices based on checkbox state
                if (syncAcrossDevicesCheckBox.isChecked()) {
                    // Enable synchronization
                    Toast.makeText(SyncDevices.this, "Syncing Across Devices Enabled", Toast.LENGTH_SHORT).show();
                    // Implement synchronization logic
                } else {
                    // Disable synchronization
                    Toast.makeText(SyncDevices.this, "Syncing Across Devices Disabled", Toast.LENGTH_SHORT).show();
                    // Implement logic to disable synchronization
                }
            }
        });

        // Set click listener for logoutButton
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement logout functionality
                performLogout();
            }
        });
    }

    private void performLogout() {
        // Implement logic to logout the user
        // For example, clear user session, navigate to login screen, etc.
        Toast.makeText(this, "Logged out", Toast.LENGTH_SHORT).show();
        // Navigate to login screen or perform logout actions
    }
}
