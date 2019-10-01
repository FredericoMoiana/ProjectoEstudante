package com.example.calendarioacademico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.calendarioacademico.Controler.ConectionDatabase;
import com.example.calendarioacademico.Model.Professor;

public class CriarProfessor extends AppCompatActivity {

    EditText txtId;
    EditText txtNome;
    EditText txtContacto;
    Button btnAdicionar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_professor);

        txtId = findViewById(R.id.txtProfessorId);
        txtNome = findViewById(R.id.txtProfessorNome);
        txtContacto = findViewById(R.id.txtProfessorContacto);
        btnAdicionar = findViewById(R.id.btnAdicionarProfessor);

        ConectionDatabase.criarConexao(this);

        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Professor professor = new Professor(Integer.parseInt(txtId.getText().toString()),txtNome.getText().toString(),
                        txtContacto.getText().toString());
                ConectionDatabase.comands.addProfessor(professor);
                Toast.makeText(CriarProfessor.this,"Sucesso", Toast.LENGTH_LONG).show();
                startActivity(new Intent(CriarProfessor.this, Login.class));
            }
        });


    }
}
