package com.example.calendarioacademico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.calendarioacademico.Controler.ConectionDatabase;
import com.example.calendarioacademico.Adapters.adapterRecycleViewDisciplinas;
import com.example.calendarioacademico.Model.Discipina;

import java.util.List;

public class RecycleViewDisciplinas extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplinas);
        ConectionDatabase.criarConexao(this);

        recyclerView= findViewById(R.id.listaDisciplinas);

        List<Discipina> discipinaList = ConectionDatabase.comands.getDisciplinas();
        adapterRecycleViewDisciplinas disciplinasAdapter = new adapterRecycleViewDisciplinas(discipinaList);
        recyclerView.setAdapter(disciplinasAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
