package com.example.myquicknotes;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ColorCustomizationActivity extends AppCompatActivity {

    private GridView colorPaletteGrid;
    private RelativeLayout notePreviewLayout;
    private String[] colors = {"#FFFFFF", "#FFC0CB", "#ADD8E6", "#98FB98", "#FFFFE0", "#FFD700", "#E6E6FA", "#FFA07A"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_customization);

        // Initialize views
        colorPaletteGrid = findViewById(R.id.colorPaletteGrid);
        notePreviewLayout = findViewById(R.id.notePreviewLayout);

        // Populate color palette grid
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, colors);
        colorPaletteGrid.setAdapter(adapter);

        // Set click listener for color palette grid
        colorPaletteGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedColor = colors[position];
                applySelectedColor(selectedColor);
            }
        });
    }

    private void applySelectedColor(String selectedColor) {
        // Set background color of note preview layout
        notePreviewLayout.setBackgroundColor(Color.parseColor(selectedColor));
    }
}
