package com.juanalberto.holausuario;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombreUsuario;
    Button nombreButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombreUsuario = findViewById(R.id.nombreIntroducido);
        nombreButton = findViewById(R.id.buttonNombre);

        nombreUsuario.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                nombreButton.setEnabled(true);
                return true;
            }
        });


        nombreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreIntroducido = nombreUsuario.getText().toString();
                if (nombreIntroducido.length()>0){
                    //AlertDialog dialogview = dialogview.create();
                    //dialogview.setTitle("Hola Usuario: " + nombreIntroducido);

                }

            }
        });

    }
}