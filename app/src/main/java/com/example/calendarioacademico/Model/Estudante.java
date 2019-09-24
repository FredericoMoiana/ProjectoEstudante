package com.example.calendarioacademico.Model;

public class Estudante {
    private int id;
    private String nome;
    private String password;
    private int curso;

    public Estudante(int id, String nome, String password, int curso) {
        this.id = id;
        this.nome = nome;
        this.password = password;
        this.curso = curso;
    }

    public Estudante() {
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id =id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
