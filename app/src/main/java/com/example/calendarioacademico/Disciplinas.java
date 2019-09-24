package com.example.calendarioacademico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.calendarioacademico.Controler.ConectionDatabase;
import com.example.calendarioacademico.Controler.adapterDisciplinas;
import com.example.calendarioacademico.Model.Discipina;
import com.example.calendarioacademico.Model.Ponte;

import java.util.List;

public class Disciplinas extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplinas);
        ConectionDatabase.criarConexao(this);
        recyclerView= findViewById(R.id.listaDisciplinas);
        List<Discipina> discipinaList = ConectionDatabase.comands.getDisciplinas();
        adapterDisciplinas disciplinasAdapter = new adapterDisciplinas(discipinaList);
        recyclerView.setAdapter(disciplinasAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
