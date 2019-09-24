package com.example.calendarioacademico.Model;

public class Discipina {
    private int id;
    private String nome;
    private int curso;

    public Discipina(int id, String nome, int curso) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
    }

    public Discipina() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
}
