package br.com.meli.apimedia.entity;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nomeAluno;
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Aluno(String nomeAluno, List<Disciplina> disciplinas){
        this.nomeAluno = nomeAluno;
        this.disciplinas = disciplinas;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
