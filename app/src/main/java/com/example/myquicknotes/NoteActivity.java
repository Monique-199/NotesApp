package com.example.myquicknotes;

import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NoteOrganizationActivity extends AppCompatActivity {

    private ListView foldersListView;
    private ListView relatedNotesListView;
    private Button createFolderTagButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        // Initialize views
        foldersListView = findViewById(R.id.foldersListView);
        relatedNotesListView = findViewById(R.id.relatedNotesListView);
        createFolderTagButton = findViewById(R.id.createFolderTagButton);

        // Simulate existing folders/tags and related notes
        String[] foldersTags = {"Folder 1", "Folder 2", "Tag 1", "Tag 2"}; // Example data
        String[] relatedNotes = {"Note 1", "Note 2", "Note 3"}; // Example data

        // Populate folders/tags ListView
        ArrayAdapter<String> foldersAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, foldersTags);
        foldersListView.setAdapter(foldersAdapter);

        // Set click listener for folders/tags ListView
        foldersListView.setOnItemClickListener((adapterView, view, position, id) -> {
            String selectedFolderTag = foldersTags[position];
            displayRelatedNotes(selectedFolderTag);
        });

        // Populate related notes ListView
        ArrayAdapter<String> relatedNotesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, relatedNotes);
        relatedNotesListView.setAdapter(relatedNotesAdapter);

        // Set click listener for the createFolderTagButton
        createFolderTagButton.setOnClickListener(view -> createNewFolderTag());
    }

    private void displayRelatedNotes(String selectedFolderTag) {
        // Logic to fetch and display related notes for the selected folder/tag
        Toast.makeText(this, "Displaying notes related to: " + selectedFolderTag, Toast.LENGTH_SHORT).show();
        // Update relatedNotesListView with notes related to selectedFolderTag
    }

    private void createNewFolderTag() {
        // Logic to create a new folder/tag
        Toast.makeText(this, "Creating new Folder/Tag", Toast.LENGTH_SHORT).show();
        // Implement the functionality to add a new folder/tag
    }
}
