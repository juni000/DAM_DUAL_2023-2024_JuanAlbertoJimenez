package com.example.mydatabaseapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {

    private Context myContext;
    private static final String TABLE_NAME = "Books";
    private static final String DATABASE_NAME = "MyLibrary.db";
    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
        this.myContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "CREATE TABLE " + TABLE_NAME +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "title TEXT NOT NULL,"+
                "author TEXT NOT NULL,"+
                "pages INTEGER)";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String query = "DROP TABLE IF EXISTS " + TABLE_NAME;
        sqLiteDatabase.execSQL(query);
        onCreate(sqLiteDatabase);
    }

    //CREATE
    public void createBooks(Book book){
        //Obtain book values
        String titleNewBook = book.get_name();
        String autorNewBook = book.get_autor();
        int pagesNewBool = book.get_pages();

        //Generate contentvalue to insert data
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", titleNewBook);
        contentValues.put("pages", pagesNewBool);
        contentValues.put("author", autorNewBook);

        SQLiteDatabase database = this.getWritableDatabase();
        try {
            long result = database.insert(TABLE_NAME,null,contentValues);
            if (result != -1){
                Toast.makeText(myContext,"Book inserted was success!",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(myContext,"Error while inserting the book",Toast.LENGTH_LONG).show();
            }
        }catch (Exception e){
            Toast.makeText(myContext,"Error while inserting the book",Toast.LENGTH_LONG).show();
        }
    }

    //READ
    public ArrayList<Book> getBooks(){
        ArrayList<Book> arrayListBooks = new ArrayList<Book>();

        //Query for obtaining all the books
        String query = "SELECT id,tile,author,pages FROM "+ TABLE_NAME ;

        //Access th database in radable mode
        SQLiteDatabase database = this.getReadableDatabase();

        Cursor result = database.rawQuery(query,null);

        while (result.moveToNext()){
            arrayListBooks.add(new Book(result.getInt(0),result.getString(1),result.getInt(3),result.getString(2)));
        }
        result.close();
        return  arrayListBooks;
    }

}
