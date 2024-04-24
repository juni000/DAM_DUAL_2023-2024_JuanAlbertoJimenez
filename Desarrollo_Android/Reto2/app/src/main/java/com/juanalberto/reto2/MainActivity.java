package com.juanalberto.reto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText comensales,importe;
    Button calcular, limpiar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Almacenamos las referencias de la interfaz
        comensales = findViewById(R.id.editTextComensales);
        importe = findViewById(R.id.editTextImporte);

        calcular = findViewById(R.id.buttonCalcular);
        limpiar = findViewById(R.id.buttonLimpiar);
        //Implementamos un evento onclick
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double numcomensales = Integer.parseInt(comensales.getText().toString());
                    double importenum = Double.parseDouble(importe.getText().toString());

                    if (numcomensales > 0 && importenum > 0) {
                        //Creamos el intent
                        Intent intent = new Intent(MainActivity.this, PantallaResultado.class);

                        //Creamos la informacion que se pasara entre pantallas
                        Bundle bundle = new Bundle();
                        bundle.putString("Comensales", comensales.getText() + "");
                        bundle.putString("Importe", importe.getText() + "");
                        //añadimos la informacion al intent
                        intent.putExtras(bundle);

                        //Iniciamos la nueva actividad
                        startActivity(intent);
                    }else {
                        if (numcomensales <= 0) {
                            comensales.setText("Número erroneo");
                        }
                        if (importenum <= 0 ) {
                            importe.setText("Número erroneo");
                        }
                    }
                }catch (NumberFormatException e){
                    comensales.setText("Introduce un valor");
                    importe.setText("Introduce un valor");
                }

            }
        });

        comensales.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                comensales.setText(null);
                return true;
            }
        });
        importe.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                importe.setText(null);
                return true;
            }
        });
        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                importe.setText(null);
                comensales.setText(null);
            }
        });

        }

    }
