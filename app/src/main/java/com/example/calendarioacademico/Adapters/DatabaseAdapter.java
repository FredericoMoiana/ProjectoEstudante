package com.example.calendarioacademico.Adapters;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//By Frederico dos Santos Moiana
public class DatabaseAdapter extends SQLiteOpenHelper {

    public DatabaseAdapter(Context context) {

        super(context, "dbEstudante", null, 1);
    }

    private String CreateCursosTable(){
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE IF NOT EXISTS CURSOS(");
        sql.append("ID  INTEGER PRIMARY KEY NOT NULL,");
        sql.append("NOME VARCHAR(25) NOT NULL)");
        return sql.toString();
}
    private String CreateNotasTable(){
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE IF NOT EXISTS NOTAS(");
        sql.append("ID INTEGER  PRIMARY KEY NOT NULL,");
        sql.append("DISCIPLINA VARCHAR(25) NOT NULL,");
        sql.append("TESTE1 DOUBLE NOT NULL,");
        sql.append("TESTE2 DOUBLE NOT NULL,");
        sql.append("TRABALHO DOUBLE NOT NULL)");
        return sql.toString();
    }
    private String CreateDisciplinaTable(){
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE IF NOT EXISTS DISCIPLINA(");
        sql.append("ID INTEGER  PRIMARY KEY NOT NULL,");
        sql.append("NOME VARCHAR(25) NOT NULL,");
        sql.append("CONTACTOPROFESSOR VARCHAR(25) NOT NULL,");
        sql.append("PROFESSOR VARCHAR(25) NOT NULL,");
        sql.append("CURSO INTEGER NOT NULL)");
        return sql.toString();
    }
    private String CreateEstudanteTable(){
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE IF NOT EXISTS ESTUDANTE(");
        sql.append("ID INTEGER  PRIMARY KEY NOT NULL,");
        sql.append("NOME VARCHAR(30) NOT NULL,");
        sql.append("PASSWORD VARCHAR(30) NOT NULL,");
        sql.append("CURSO VARCHAR(25) NOT NULL)");
        return sql.toString();
    }
    private String CreateProfessorTable(){
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE IF NOT EXISTS PROFESSOR(");
        sql.append("ID INTEGER  PRIMARY KEY NOT NULL,");
        sql.append("NOME VARCHAR(30) NOT NULL,");
        sql.append("CONTACTO VARCHAR(30) NOT NULL");
        return sql.toString();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CreateCursosTable());
        sqLiteDatabase.execSQL(CreateNotasTable());
        sqLiteDatabase.execSQL(CreateEstudanteTable());
        sqLiteDatabase.execSQL(CreateDisciplinaTable());
        sqLiteDatabase.execSQL(CreateProfessorTable());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
