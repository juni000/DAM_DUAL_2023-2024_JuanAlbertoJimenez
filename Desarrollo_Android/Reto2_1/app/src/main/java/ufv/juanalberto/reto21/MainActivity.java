package ufv.juanalberto.reto21;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button buttonLleno;
    Button buttonPrepago;
    Button buttonCalcular;
    EditText cantidad;
    TextView textView1, textView2, textView3, textView4, textView5, textViewValor;
    ImageView imageView1, imageView2, imageView3, imageView4;
    RadioGroup grupo;
    RadioButton bottonDiesel, bottonDieselPlus, bottonGas95, bottonGas98;
    boolean lleno = true;
    String seleccion = "";
    double precio = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        
        buttonLleno = findViewById(R.id.buttonLleno);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        buttonPrepago = findViewById(R.id.buttonPrepago);

        cantidad = findViewById(R.id.editTextValor);
        grupo = findViewById(R.id.radioGroup);
        bottonDiesel = findViewById(R.id.radioButtonDiesel);
        bottonDieselPlus = findViewById(R.id.radioButtonDieselPlus);
        bottonGas95 = findViewById(R.id.radioButtonGas95);
        bottonGas98 = findViewById(R.id.radioButtonGas98);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textViewValor = findViewById(R.id.textViewValor);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);

        ponerInvisible();

        buttonLleno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lleno = true;
                ponerVisible();
                cantidad.setText("Introduzca la cantidad de Litros");
                textViewValor.setText("L");
            }
        });
        buttonPrepago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lleno = false;
                ponerVisible();
                cantidad.setText("Introduzca la cantidad de Euros");
                textViewValor.setText("€");
            }
        });

        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton elegido = findViewById(checkedId);
                buttonCalcular.setVisibility(View.VISIBLE);

                if (elegido!=null){
                    seleccion = elegido.getText().toString();
                    if (seleccion.contains("95")) precio = 1.62;
                    else if (seleccion.contains("98")) precio = 1.79;
                    else if (seleccion.contains("Plus")) precio = 1.53;
                    else if (seleccion.contains("Diésel")) precio = 1.33;

                }


            }
        });

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double cantidadnum = Double.parseDouble(cantidad.getText().toString());
                    if (cantidadnum > 0){
                        Intent intent = new Intent(MainActivity.this, PantallaResultado.class);
                        intent.putExtra("Tipo", lleno);
                        intent.putExtra("Cantidad", cantidadnum);
                        intent.putExtra("Precio", precio);
                        startActivity(intent);
                    }else cantidad.setText("Introduzca un valor valido");

                }catch (NumberFormatException e){
                    cantidad.setText("Introduzca un valor valido");
                }



            }
        });
        cantidad.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                cantidad.setText("");
                return false;
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void ponerInvisible(){
        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        textViewValor.setVisibility(View.INVISIBLE);
        imageView1.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        imageView3.setVisibility(View.INVISIBLE);
        imageView4.setVisibility(View.INVISIBLE);
        bottonDiesel.setVisibility(View.INVISIBLE);
        bottonDieselPlus.setVisibility(View.INVISIBLE);
        bottonGas95.setVisibility(View.INVISIBLE);
        bottonGas98.setVisibility(View.INVISIBLE);
        cantidad.setVisibility(View.INVISIBLE);
        buttonCalcular.setVisibility(View.INVISIBLE);
    }
    public void ponerVisible(){
        textView1.setVisibility(View.VISIBLE);
        textView2.setVisibility(View.VISIBLE);
        textView3.setVisibility(View.VISIBLE);
        textView4.setVisibility(View.VISIBLE);
        textView5.setVisibility(View.VISIBLE);
        textViewValor.setVisibility(View.VISIBLE);
        imageView1.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.VISIBLE);
        imageView3.setVisibility(View.VISIBLE);
        imageView4.setVisibility(View.VISIBLE);
        bottonDiesel.setVisibility(View.VISIBLE);
        bottonDieselPlus.setVisibility(View.VISIBLE);
        bottonGas95.setVisibility(View.VISIBLE);
        bottonGas98.setVisibility(View.VISIBLE);
        cantidad.setVisibility(View.VISIBLE);
    }
}