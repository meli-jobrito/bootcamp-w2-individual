package br.com.meli.apimedia.entity;

public class Disciplina {
    private String nomeDisciplina;
    private double nota;

    public Disciplina(String nomeDisciplina, double nota){
        this.nomeDisciplina = nomeDisciplina;
        this.nota = nota;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota){
        this.nota = nota;
    }
}
