package com.example.calendarioacademico.Controler;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.calendarioacademico.Model.Discipina;
import com.example.calendarioacademico.Model.Estudante;

import java.util.ArrayList;
import java.util.List;

public class Comands {

    private SQLiteDatabase conection;

    public Comands(SQLiteDatabase yes){
        conection = yes;
    }
    public void addEstudantes(Estudante estudante){
        ContentValues contentValues = new ContentValues();
        contentValues.put("ID", estudante.getId());
        contentValues.put("NOME", estudante.getNome());
        contentValues.put("PASSWORD", estudante.getPassword());
        contentValues.put("CURSO", estudante.getCurso());
        conection.insertOrThrow("ESTUDANTE", null, contentValues);
    }
    public void addDisciplina(Discipina discipina){
        ContentValues contentValues = new ContentValues();
        contentValues.put("ID", discipina.getId());
        contentValues.put("NOME", discipina.getNome());
        contentValues.put("CURSO", discipina.getCurso());
        conection.insertOrThrow("DISCIPLINA", null, contentValues);
    }

    public List<Estudante> getEstudantes(){
        ArrayList<Estudante> estudantes = new ArrayList<>();
        Cursor cursor = conection.rawQuery("select * from Estudante", null);
        if(cursor.getCount() >0){
            cursor.moveToFirst();
            do{
                Estudante aluno = new Estudante();
                aluno.setId(cursor.getInt(cursor.getColumnIndexOrThrow("ID")));
                aluno.setNome(cursor.getString(cursor.getColumnIndexOrThrow("NOME")));
                aluno.setCurso(cursor.getInt(cursor.getColumnIndexOrThrow("CURSO")));
                aluno.setPassword(cursor.getString(cursor.getColumnIndexOrThrow("PASSWORD")));
                estudantes.add(aluno);
            }while (cursor.moveToNext());
        }
        return estudantes;
    }
    public List<Discipina> getDisciplinas(){
        ArrayList<Discipina> discipinas = new ArrayList<>();
        Cursor cursor = conection.rawQuery("select * from Disciplina", null);
        if(cursor.getCount() >0){
            cursor.moveToFirst();
            do{
                Discipina aluno = new Discipina();
                aluno.setId(cursor.getInt(cursor.getColumnIndexOrThrow("ID")));
                aluno.setNome(cursor.getString(cursor.getColumnIndexOrThrow("NOME")));
                aluno.setCurso(cursor.getInt(cursor.getColumnIndexOrThrow("CURSO")));
                discipinas.add(aluno);
            }while (cursor.moveToNext());
        }
        return discipinas;
    }
}
