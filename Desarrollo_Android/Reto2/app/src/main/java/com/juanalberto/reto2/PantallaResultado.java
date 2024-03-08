package com.juanalberto.reto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PantallaResultado extends AppCompatActivity {
    TextView comensales, importe, parte;
    Button atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_resultado);
        //Localizar los controles
        comensales = (TextView)findViewById(R.id.textViewComensales);
        importe = (TextView)findViewById(R.id.textViewImporte);
        parte = (TextView)findViewById(R.id.textViewParte);
        atras = findViewById(R.id.buttonAtras);
        //Recuperar la informacion pasada en el intent
        Bundle bundle = this.getIntent().getExtras();

        //Construimos el mensaje
        comensales.setText(bundle.getString("Comensales"));
        importe.setText(bundle.getString("Importe"));
        double parteDouble = (Double.parseDouble(bundle.getString("Importe")) / Double.parseDouble(bundle.getString("Comensales")));
        parte.setText(String.format("%.2f",parteDouble) + "€");

        //Boton para volver
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaResultado.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}