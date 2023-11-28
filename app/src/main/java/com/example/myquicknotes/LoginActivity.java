package com.example.myquicknotes;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

        EditText usernameOrEmailField = findViewById(R.id.usernameOrEmailField);
        EditText passwordField = findViewById(R.id.passwordField);
        Button signInButton = findViewById(R.id.signInButton);
        TextView forgotPasswordLink = findViewById(R.id.forgotPasswordLink);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameOrEmail = usernameOrEmailField.getText().toString().trim();
                String password = passwordField.getText().toString().trim();

                if (usernameOrEmail.isEmpty() || password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please enter username/email and password", Toast.LENGTH_SHORT).show();
                } else {
                    signInWithEmailAndPassword(usernameOrEmail, password);
                }
            }
        });

        forgotPasswordLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement the logic to handle forgot password functionality
                // For example, redirect to a password reset activity or send a reset email
                // Intent to reset password activity or initiate password reset email
            }
        });
    }

    private void signInWithEmailAndPassword(String usernameOrEmail, String password) {
        mAuth.signInWithEmailAndPassword(usernameOrEmail, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            FirebaseUser user = mAuth.getCurrentUser();
                            // You can redirect to another activity upon successful sign-in
                            Toast.makeText(LoginActivity.this, "Sign in successful.", Toast.LENGTH_SHORT).show();
                        } else {
                            // If sign-in fails, display a message to the user.
                            Toast.makeText(LoginActivity.this, "Sign in failed. " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
