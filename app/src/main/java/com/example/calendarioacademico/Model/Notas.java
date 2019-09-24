package com.example.calendarioacademico.Model;

public class Notas {

    private int disciplina;
    private double teste1;
    private double teste2;
    private double trabalho;

    public Notas(int disciplina, double teste1, double teste2, double trabalho) {
        this.disciplina = disciplina;
        this.teste1 = teste1;
        this.teste2 = teste2;
        this.trabalho = trabalho;
    }

    public int getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(int disciplina) {
        this.disciplina = disciplina;
    }

    public double getTeste1() {
        return teste1;
    }

    public void setTeste1(double teste1) {
        this.teste1 = teste1;
    }

    public double getTeste2() {
        return teste2;
    }

    public void setTeste2(double teste2) {
        this.teste2 = teste2;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }
}
