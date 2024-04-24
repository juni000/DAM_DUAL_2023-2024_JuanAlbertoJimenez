package com.example.mydatabaseapplication;

public class Book {
    private int _id;
    private String _name;
    private int _pages;
    private String _autor;

    public Book(String _name, int _pages, String _autor) {
        this._name = _name;
        this._pages = _pages;
        this._autor = _autor;
    }

    public Book(int _id, String _name, int _pages, String _autor) {
        this._id = _id;
        this._name = _name;
        this._pages = _pages;
        this._autor = _autor;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int get_pages() {
        return _pages;
    }

    public void set_pages(int _pages) {
        this._pages = _pages;
    }

    public String get_autor() {
        return _autor;
    }

    public void set_autor(String _autor) {
        this._autor = _autor;
    }
}
