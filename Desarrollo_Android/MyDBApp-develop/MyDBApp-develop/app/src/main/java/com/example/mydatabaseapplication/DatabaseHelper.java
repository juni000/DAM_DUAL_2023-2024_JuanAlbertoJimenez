package com.example.mydatabaseapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {

    private Context myContext;
    private static final String DATABASE_NAME = "MyListaEjercicios.db";
    private static final String TABLE_NAME = "Ejercicios";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
        this.myContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "CREATE TABLE " + TABLE_NAME +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "nombre TEXT NOT NULL,"+
                "descripcion TEXT NOT NULL,"+
                "peso INTEGER)";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String query = "DROP TABLE IF EXISTS " + TABLE_NAME;
        sqLiteDatabase.execSQL(query);
        onCreate(sqLiteDatabase);
    }

    //CREATE
    public void createBook(Ejercicio ejercicio){
        //Obtain book values
        String nombreNewEjercicio = ejercicio.get_nombre();
        String descripcionNewEjercicio = ejercicio.get_descripcion();
        int PesoNewEjercicio = ejercicio.get_peso();

        //Generate contentvalues to insert data
        ContentValues contentValues = new ContentValues();
        contentValues.put("nombre",nombreNewEjercicio);
        contentValues.put("descripcion",descripcionNewEjercicio);
        contentValues.put("peso",PesoNewEjercicio);

        //Access to the DB in write mode
        SQLiteDatabase database = this.getWritableDatabase();

        //Try to insert the book
        try{
            long result = database.insert(TABLE_NAME,null,contentValues);
            if(result != -1){
                //OK
                Toast.makeText(myContext,"Ejercicio insertado!",Toast.LENGTH_LONG).show();
            }
            else{
                //BAD
                Toast.makeText(myContext,"Error insertando el ejercicio",Toast.LENGTH_LONG).show();
            }
        }
        catch (Exception ex){
            //Exception
            Toast.makeText(myContext,"Error insertando el ejercicio" + ex.toString(),Toast.LENGTH_LONG).show();
        }
    }

    //READ
    public ArrayList<Ejercicio> getEjercicio(){
        ArrayList<Ejercicio> allEjercicios = new ArrayList<Ejercicio>();
        //Query for obtaining all the books
        String query = "SELECT id, nombre, descripcion, peso FROM " + TABLE_NAME;
        //Access the database in readable mode
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor result = database.rawQuery(query,null);

        while(result.moveToNext()){
            allEjercicios.add(new Ejercicio(result.getInt(0),
                            result.getString(1),
                            result.getString(2),
                            result.getInt(3)));
        }
        result.close();
        return allEjercicios;
    }

    public void deleteBook(String idtext) {
        SQLiteDatabase database = this.getWritableDatabase();
        int result = database.delete(TABLE_NAME,"id = ?",new String[]{idtext});
        if (result != 0 ) Toast.makeText(myContext,"Ejercicio Eliminado",Toast.LENGTH_LONG).show();
        else Toast.makeText(myContext,"Error Eliminando el ejercicio",Toast.LENGTH_LONG).show();

    }

    public void updateBook(String newEjercicio, String newDescripcion, int newPeso, String id) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("nombre",newEjercicio);
        contentValues.put("descripcion",newDescripcion);
        contentValues.put("peso",newPeso);

        int updateResult = database.update(TABLE_NAME,contentValues,"id = ?",new String[]{id});
        if (updateResult==-1){
            Toast.makeText(myContext,"Error actualizando el ejercicio",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(myContext,"ejercicio actualizado",Toast.LENGTH_LONG).show();
        }
    }

}
