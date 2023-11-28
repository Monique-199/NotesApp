package com.example.myquicknotes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText noteContentEditText;
    private ListView notesListView;
    private Button boldButton, italicButton, bulletPointButton;
    private Button saveButton, deleteButton, organizeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        noteContentEditText = findViewById(R.id.noteContentEditText);
        notesListView = findViewById(R.id.notesListView);
        boldButton = findViewById(R.id.boldButton);
        italicButton = findViewById(R.id.italicButton);
        bulletPointButton = findViewById(R.id.bulletPointButton);
        saveButton = findViewById(R.id.saveButton);
        deleteButton = findViewById(R.id.deleteButton);
        organizeButton = findViewById(R.id.organizeButton);

        // Set click listeners for formatting options buttons
        boldButton.setOnClickListener(view -> applyBoldFormatting());
        italicButton.setOnClickListener(view -> applyItalicFormatting());
        bulletPointButton.setOnClickListener(view -> applyBulletPoint());

        // Set click listeners for action buttons
        saveButton.setOnClickListener(view -> saveNote());
        deleteButton.setOnClickListener(view -> deleteNote());
        organizeButton.setOnClickListener(view -> organizeNotes());

        // Simulate existing notes
        String[] existingNotes = {"Note 1", "Note 2", "Note 3"}; // Example data
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, existingNotes);
        notesListView.setAdapter(adapter);
    }

    private void applyBoldFormatting() {
        // Implement bold formatting action for selected text in noteContentEditText
        Toast.makeText(this, "Bold Formatting Applied", Toast.LENGTH_SHORT).show();
    }

    private void applyItalicFormatting() {
        // Implement italic formatting action for selected text in noteContentEditText
        Toast.makeText(this, "Italic Formatting Applied", Toast.LENGTH_SHORT).show();
    }

    private void applyBulletPoint() {
        // Implement bullet point formatting action for selected text in noteContentEditText
        Toast.makeText(this, "Bullet Point Applied", Toast.LENGTH_SHORT).show();
    }

    private void saveNote() {
        // Implement logic to save the note entered in noteContentEditText
        Toast.makeText(this, "Note Saved", Toast.LENGTH_SHORT).show();
    }

    private void deleteNote() {
        // Implement logic to delete selected note from the notesListView
        Toast.makeText(this, "Note Deleted", Toast.LENGTH_SHORT).show();
    }

    private void organizeNotes() {
        // Implement logic to organize or manage notes
        Toast.makeText(this, "Notes Organized", Toast.LENGTH_SHORT).show();
    }
}


