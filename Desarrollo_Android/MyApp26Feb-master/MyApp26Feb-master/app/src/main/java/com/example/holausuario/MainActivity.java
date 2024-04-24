package com.example.holausuario;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Caja del nombre del usuario
    EditText nombreUsuario;

    Button setNombreButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asociamos los objetos creados con los de la vista
        nombreUsuario = findViewById(R.id.nombreIntroducido);
        setNombreButton = findViewById(R.id.setNameButton);

        //Creamos el popup
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog dialogView = builder.create();

        nombreUsuario.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                setNombreButton.setEnabled(true);
                return true;
            }
        });

        setNombreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Obtenemos el nombreIntroducido
                String nombreIntroducido = nombreUsuario.getText().toString();

                if(nombreIntroducido.length()>0){
                    dialogView.setTitle("Hola Usuario: " + nombreIntroducido);
                    dialogView.show();
                }
            }
        });

    }
}