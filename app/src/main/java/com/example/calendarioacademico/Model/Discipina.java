package com.example.calendarioacademico.Model;

public class Discipina {
    private int id;
    private String nome;
    private String nomeProfessor;
    private String contactoProfessor;
    private String curso;

    public Discipina(int id, String nome, String nomeProfessor, String contactoProfessor, String curso) {
        this.id = id;
        this.nome = nome;
        this.nomeProfessor = nomeProfessor;
        this.contactoProfessor = contactoProfessor;
        this.curso = curso;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getContactoProfessor() {
        return contactoProfessor;
    }

    public void setContactoProfessor(String contactoProfessor) {
        this.contactoProfessor = contactoProfessor;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
