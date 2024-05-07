package com.example.mydatabaseapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UpdateActivity extends AppCompatActivity {
    EditText ejercicioField;
    EditText descripcionField;
    EditText pesoField;
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
        ejercicioField = findViewById(R.id.editTextEjercicio);
        descripcionField = findViewById(R.id.editTextDescripcion);
        pesoField = findViewById(R.id.editTextPeso);

        update = findViewById(R.id.buttonUpdate);
        delete = findViewById(R.id.buttonDelete);

        //obtengo los datos del intent
        String idtext = getIntent().getStringExtra("id");
        String descripciontext = getIntent().getStringExtra("descripcion");
        String ejerciciotext = getIntent().getStringExtra("nombre");
        String pesotext = getIntent().getStringExtra("peso");

        ejercicioField.setText(ejerciciotext);
        descripcionField.setText(descripciontext);
        pesoField.setText(pesotext);

        myBDHelper =new DatabaseHelper(UpdateActivity.this);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newEjercicio = ejercicioField.getText().toString().trim();
                String newDescripcion = descripcionField.getText().toString().trim();
                int newPeso = Integer.parseInt(pesoField.getText().toString());
                myBDHelper.updateBook(newEjercicio, newDescripcion, newPeso , idtext);

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