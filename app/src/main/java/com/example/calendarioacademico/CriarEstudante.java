package com.example.calendarioacademico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.calendarioacademico.Controler.ConectionDatabase;
import com.example.calendarioacademico.Model.Estudante;

public class CriarEstudante extends AppCompatActivity {

    EditText txtId;
    EditText txtNome;
    EditText txtPass;
    EditText txtCurso;
    Button btnAdicionarEstudante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_estudante);

        txtId = findViewById(R.id.txtIdEstudante);
        txtNome = findViewById(R.id.txtNomeEstudante);
        txtCurso = findViewById(R.id.txtCursoEstudante);
        txtPass = findViewById(R.id.txtPassowordEstudante);
        btnAdicionarEstudante = findViewById(R.id.btnAdicionarEstudante);

        ConectionDatabase.criarConexao(this);

        btnAdicionarEstudante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Estudante e= new Estudante(Integer.parseInt(txtId.getText().toString()),
                        txtNome.getText().toString(), txtPass.getText().toString(),
                        txtCurso.getText().toString());
                ConectionDatabase.comands.addEstudante(e);
                Toast.makeText(CriarEstudante.this,"Sucesso", Toast.LENGTH_LONG).show();
                startActivity(new Intent(CriarEstudante.this, Login.class));
            }
        });

    }
}
