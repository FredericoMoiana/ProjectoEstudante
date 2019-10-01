package com.example.calendarioacademico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.calendarioacademico.Controler.ConectionDatabase;
import com.example.calendarioacademico.Controler.VerificacaoLogin;
import com.example.calendarioacademico.Model.Estudante;

public class Login extends AppCompatActivity {

    EditText txtNumero;
    EditText txtPassword;
    Button btnLogin;
    Button btnNovaConta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        txtNumero = findViewById(R.id.txtNumero);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnNovaConta = findViewById(R.id.btnNovaConta);

        ConectionDatabase.criarConexao(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Estudante estudante = VerificacaoLogin.checkCredenciais(Integer.parseInt(
                        txtNumero.getText().toString()),
                        txtPassword.getText().toString(), Login.this);
                if (estudante!=null){
                   startActivity(new Intent(Login.this, RecycleViewDisciplinas.class));
                }else {
                    VerificacaoLogin.toast("Nao existe", Login.this);
                }
            }
        });
        btnNovaConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, CriarEstudante.class));
            }
        });
    }

}
