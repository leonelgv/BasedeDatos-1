package com.example.juancastro.basededatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    // Creamos el constructor
    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    // Se crea la tabla
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table animales (id integer primary key unique,  nombre_comun text, nombre_cient text, habitat text, caracteristicas text) ");
    }

    // borrar la tabla y crear la nueva tabla
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists animales");
        db.execSQL("create table animales (id integer primary key unique,  nombre_comun text, nombre_cient text, habitat text, caracteristicas text) ");
    }
}
