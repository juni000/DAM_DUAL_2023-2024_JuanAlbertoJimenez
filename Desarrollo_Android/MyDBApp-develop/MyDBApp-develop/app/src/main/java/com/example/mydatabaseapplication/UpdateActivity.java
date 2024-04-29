package com.example.mydatabaseapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UpdateActivity extends AppCompatActivity {
    EditText titleField;
    EditText authorField;
    EditText pagesField;
    Button delete;
    Button update;

    DatabaseHelper myBDHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_update);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        titleField = findViewById(R.id.editTextTitle);
        authorField = findViewById(R.id.editTextAuthor);
        pagesField = findViewById(R.id.editTextPages);

        update = findViewById(R.id.buttonUpdate);
        delete = findViewById(R.id.buttonDelete);

        //obtengo los datos del intent
        String idtext = getIntent().getStringExtra("id");
        String authortext = getIntent().getStringExtra("author");
        String titletext = getIntent().getStringExtra("title");
        String pagestext = getIntent().getStringExtra("pages");

        titleField.setText(titletext);
        authorField.setText(authortext);
        pagesField.setText(pagestext);

        myBDHelper =new DatabaseHelper(UpdateActivity.this);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myBDHelper.deleteBook(idtext);
            }
        });
    }
}