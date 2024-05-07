package com.example.mydatabaseapplication;

public class Ejercicio {

    private int _id;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_nombre() {
        return _nombre;
    }

    public void set_nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String get_descripcion() {
        return _descripcion;
    }

    public void set_descripcion(String _descripcion) {
        this._descripcion = _descripcion;
    }

    public int get_peso() {
        return _peso;
    }

    public void set_peso(int _peso) {
        this._peso = _peso;
    }

    private String _nombre;

    private String _descripcion;

    private int _peso;

    //Constructor for adding a new Book
    public Ejercicio(String _nombre, String _descripcion, int _peso){
        this._nombre = _nombre;
        this._descripcion = _descripcion;
        this._peso = _peso;
    }

    //Constructor for retrieving all the books
    public Ejercicio(int _id, String _nombre, String _descripcion, int _peso){
        this._id = _id;
        this._nombre = _nombre;
        this._descripcion = _descripcion;
        this._peso = _peso;
    }



}
