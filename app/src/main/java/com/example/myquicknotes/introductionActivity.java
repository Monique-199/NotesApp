package com.example.myquicknotes;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class introductionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        Button getStartedButton = findViewById(R.id.getStartedButton);
        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action when "Get Started" button is clicked
                // For example, navigate to the next activity
                startActivity(new Intent(introductionActivity.this, LoginActivity.class));
                // Replace NextActivity.class with your desired destination activity
            }
        });
    }
    }
