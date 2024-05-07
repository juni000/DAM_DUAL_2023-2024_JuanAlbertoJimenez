package com.example.mydatabaseapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyBookView> {

    private Context context;
    private ArrayList<Ejercicio> ejercicios;

    CustomAdapter(Context context, ArrayList<Ejercicio> ejercicios){
        this.context = context;
        this.ejercicios = ejercicios;
    }
    @NonNull
    @Override
    public CustomAdapter.MyBookView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_ejercicio, parent, false);
        return new MyBookView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyBookView holder, int position) {
        holder.ejercicioId.setText(String.valueOf(position+1));
        holder.ejercicioNombre.setText(String.valueOf(ejercicios.get(position).get_nombre()));
        holder.ejercicioDescripcion.setText(String.valueOf(ejercicios.get(position).get_descripcion()));
        holder.ejercicioPeso.setText(String.valueOf(ejercicios.get(position).get_peso()));
        holder.textViewId.setText(String.valueOf(ejercicios.get(position).get_id()));
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, UpdateActivity.class);

                //Pasamos los datos a la pantalla
                intent.putExtra("id",String.valueOf(holder.textViewId.getText()));
                intent.putExtra("nombre",String.valueOf(holder.ejercicioNombre.getText()));
                intent.putExtra("descripcion",String.valueOf(holder.ejercicioDescripcion.getText()));
                intent.putExtra("peso",String.valueOf(holder.ejercicioPeso.getText()));

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return ejercicios.size();
    }

    public class MyBookView extends RecyclerView.ViewHolder {
        LinearLayout mainLayout;
        TextView ejercicioId;
        TextView ejercicioNombre;
        TextView ejercicioDescripcion;
        TextView ejercicioPeso;
        TextView textViewId;

        public MyBookView(@NonNull View itemView) {
            super(itemView);
            mainLayout = itemView.findViewById(R.id.mainLayout);
            ejercicioId = itemView.findViewById(R.id.ejercicioId);
            ejercicioDescripcion = itemView.findViewById(R.id.ejercicioDescripcion);
            ejercicioNombre = itemView.findViewById(R.id.ejercicioNombre);
            ejercicioPeso = itemView.findViewById(R.id.ejercicioPeso);
            textViewId = itemView.findViewById(R.id.textViewid);
        }
    }
}
