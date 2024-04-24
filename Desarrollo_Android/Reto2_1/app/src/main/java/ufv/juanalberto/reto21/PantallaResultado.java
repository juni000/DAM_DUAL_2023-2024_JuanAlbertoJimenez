package ufv.juanalberto.reto21;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PantallaResultado extends AppCompatActivity {

    TextView textViewCantidad;
    TextView textViewCantidadnum;
    TextView textViewPrecionum;
    TextView textViewResultadonum;
    boolean lleno = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pantalla_resultado);

        textViewCantidad = findViewById(R.id.textViewCantidad);
        textViewCantidadnum = findViewById(R.id.textViewCantidadnum);
        textViewPrecionum = findViewById(R.id.textViewPrecionum);
        textViewResultadonum = findViewById(R.id.textViewResultadonum);

        Intent intent = getIntent();
        if (lleno=intent.getBooleanExtra("Tipo",true)){
            textViewCantidad.setText("Litros a rellenar:");
        }else{
            textViewCantidad.setText("Euros a pagar:");
        }
        textViewCantidadnum.setText(String.format("%.2f",intent.getDoubleExtra("Cantidad",0)));
        textViewPrecionum.setText(String.format("%.2f",intent.getDoubleExtra("Precio",0)) + "€/L");
        if (lleno){
            textViewResultadonum.setText(String.format("%.2f",intent.getDoubleExtra("Precio",0)*intent.getDoubleExtra("Cantidad",0)) + "€");
        }else{
            textViewResultadonum.setText(String.format("%.2f",intent.getDoubleExtra("Cantidad",0)/intent.getDoubleExtra("Precio",0)) + "€");
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}