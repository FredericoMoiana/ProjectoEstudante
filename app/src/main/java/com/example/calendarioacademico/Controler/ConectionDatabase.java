package com.example.calendarioacademico.Controler;

import android.app.AlertDialog;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import com.example.calendarioacademico.Model.Ponte;

public class ConectionDatabase {

    private static SQLiteDatabase conection;
    private static DatabaseAdapter adapter;
    public static Comands comands;

    public static void criarConexao(Context context){
        try{
            adapter = new DatabaseAdapter(context);
            conection = adapter.getReadableDatabase();
            comands = new Comands(conection);
        }catch (Exception e){
            AlertDialog.Builder dialog = new AlertDialog.Builder(context);
            dialog.setMessage(e.getMessage());
            dialog.setTitle("Error");
            dialog.show();
        }
    }
}
