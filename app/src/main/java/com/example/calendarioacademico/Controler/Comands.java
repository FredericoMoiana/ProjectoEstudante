package com.example.calendarioacademico.Controler;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.calendarioacademico.Model.Discipina;
import com.example.calendarioacademico.Model.Estudante;
import com.example.calendarioacademico.Model.Notas;
import com.example.calendarioacademico.Model.Professor;

import java.util.ArrayList;
import java.util.List;

public class Comands {

    private SQLiteDatabase conection;

    public Comands(SQLiteDatabase yes){
        conection = yes;
    }

    public void addEstudante(Estudante estudante){
        ContentValues contentValues = new ContentValues();
        contentValues.put("ID", estudante.getId());
        contentValues.put("NOME", estudante.getNome());
        contentValues.put("PASSWORD", estudante.getPassword());
        contentValues.put("CURSO", estudante.getCurso());
        conection.insertOrThrow("ESTUDANTE", null, contentValues);
    }
    public void addProfessor(Professor professor){
        ContentValues contentValues = new ContentValues();
        contentValues.put("ID", professor.getId());
        contentValues.put("NOME", professor.getNome());
        contentValues.put("PASSWORD", professor.getContacto());
        conection.insertOrThrow("PROFESSOR", null, contentValues);
    }

    public void addDisciplina(Discipina discipina){
        ContentValues contentValues = new ContentValues();
        contentValues.put("ID", discipina.getId());
        contentValues.put("NOME", discipina.getNome());
        contentValues.put("CURSO", discipina.getCurso());
        conection.insertOrThrow("DISCIPLINA", null, contentValues);
    }

    public void addNotas(Notas notas){
        ContentValues contentValues = new ContentValues();
        contentValues.put("ID", notas.getDisciplina());
        contentValues.put("NOME", notas.getTeste1());
        contentValues.put("PASSWORD", notas.getTeste2());
        contentValues.put("TRABALHO", notas.getTrabalho());
        conection.insertOrThrow("Notas", null, contentValues);
    }

//    public List<Notas> getNotas(){
//        ArrayList<Notas> notas = new ArrayList<>();
//        Cursor cursor = conection.rawQuery("select * from Notas", null);
//        if(cursor.getCount() >0){
//            cursor.moveToFirst();
//            do{
//                Notas notas1 = new Notas();
//                notas1.setDisciplina(cursor.getInt(cursor.getColumnIndexOrThrow("DISCIPLINA")));
//                notas1.setTeste1(cursor.getDouble(cursor.getColumnIndexOrThrow("NOME")));
//                notas1.setCurso(cursor.getDouble(cursor.getColumnIndexOrThrow("CURSO")));
//                aluno.setPassword(cursor.getDouble(cursor.getColumnIndexOrThrow("PASSWORD")));
//                estudantes.add(aluno);
//            }while (cursor.moveToNext());
//        }
//        return estudantes;
//    }
    public List<Estudante> getEstudantes(){
        ArrayList<Estudante> estudantes = new ArrayList<>();
        Cursor cursor = conection.rawQuery("select * from Estudante", null);
        if(cursor.getCount() >0){
            cursor.moveToFirst();
            do{
                Estudante aluno = new Estudante();
                aluno.setId(cursor.getInt(cursor.getColumnIndexOrThrow("ID")));
                aluno.setNome(cursor.getString(cursor.getColumnIndexOrThrow("NOME")));
                aluno.setPassword(cursor.getString(cursor.getColumnIndexOrThrow("PASSWORD")));
                estudantes.add(aluno);
            }while (cursor.moveToNext());
        }
        cursor.close();
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
                aluno.setCurso(cursor.getString(cursor.getColumnIndexOrThrow("CURSO")));
                discipinas.add(aluno);
            }while (cursor.moveToNext());
        }
        cursor.close();
        return discipinas;
    }
}
