package com.example.mydatabaseapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddDataActivity extends AppCompatActivity {

    //Defino objetos que voy a usar
    EditText ejercicio;
    EditText descripcion;
    EditText peso;
    Button addEjercicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);

        //Asigno los objetos creados a los elementos de la vista
        ejercicio = findViewById(R.id.ejercicioText);
        descripcion = findViewById(R.id.descripcionText);
        peso = findViewById(R.id.pesoText);
        addEjercicio = findViewById(R.id.addButton);

        //Limpiamos los campos
        detectAndCleanFields();

        addEjercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Cogemos los datos que ha insertado el usuario
                String ejercicioInsertado = ejercicio.getText().toString().trim();
                String descripcionInsertado = descripcion.getText().toString().trim();
                String pesoInsertado = peso.getText().toString();

                //Obtengo la base de datos
                DatabaseHelper dbHelper = new DatabaseHelper(AddDataActivity.this);

                Ejercicio newEjercicio = new Ejercicio(ejercicioInsertado, descripcionInsertado, Integer.parseInt(pesoInsertado));

                dbHelper.createBook(newEjercicio);

            }
        });

    }

    private void detectAndCleanFields() {
        ejercicio.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                ejercicio.setText("");
                return false;
            }
        });

        descripcion.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                descripcion.setText("");
                return false;
            }
        });

        peso.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                peso.setText("");
                return false;
            }
        });
    }
}