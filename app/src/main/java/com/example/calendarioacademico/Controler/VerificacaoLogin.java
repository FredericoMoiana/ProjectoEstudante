package com.example.calendarioacademico.Controler;

import android.content.Context;
import android.widget.Toast;

import com.example.calendarioacademico.Controler.ConectionDatabase;
import com.example.calendarioacademico.Model.Estudante;

import java.sql.Connection;
import java.util.List;

public class VerificacaoLogin {

    public static Estudante checkCredenciais(int user, String pass, Context context){
        ConectionDatabase.criarConexao(context);
        List<Estudante> estudanteList = ConectionDatabase.comands.getEstudantes();
        for (Estudante estudante:estudanteList) {
            if (user==estudante.getId() && pass.equals(estudante.getPassword()))
                return estudante;
        }
        return  null;
    }
    public static void toast(String message,Context context){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}
