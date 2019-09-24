package com.example.calendarioacademico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.calendarioacademico.Controler.Comands;
import com.example.calendarioacademico.Controler.ConectionDatabase;
import com.example.calendarioacademico.Model.Discipina;
import com.example.calendarioacademico.Model.Estudante;
import com.example.calendarioacademico.Model.Ponte;

public class MainActivity extends AppCompatActivity {

    EditText txtNumero;
    EditText txtPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumero = findViewById(R.id.txtNumero);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        ConectionDatabase.criarConexao(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Estudante estudante = Ponte.checkCredenciais(Integer.parseInt(txtNumero.getText().toString()),txtPassword.getText().toString(),MainActivity.this);
                if (estudante!=null){
                   startActivity(new Intent(MainActivity.this, Disciplinas.class));
                }else {
                    Ponte.toast("Nao existe",MainActivity.this);
                }
            }
        });
    }

}
