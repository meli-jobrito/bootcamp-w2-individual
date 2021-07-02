package br.com.meli.apimedia.dto;

import br.com.meli.apimedia.entity.Aluno;
import br.com.meli.apimedia.entity.Disciplina;

import java.util.List;
import java.util.OptionalDouble;

public class AlunoDTO {
    private String nomeAluno;
    private List<Disciplina> disciplinas;

    public AlunoDTO(String nomeAluno, List<Disciplina> disciplinas){
        this.nomeAluno = nomeAluno;
        this.disciplinas = disciplinas;
    }
    public AlunoDTO(){

    }
    public AlunoDTO converte(Aluno aluno){
        System.out.println(aluno.getNomeAluno()+"------"+ aluno.getDisciplinas());
        return new AlunoDTO(aluno.getNomeAluno(), aluno.getDisciplinas());
    }

    public String getMensagem(){
        if(this.getMedia()>=9.0){
            return "Parabéns! Sua nota foi maior que 9!";
        }else{
            return "Voce passou!";
        }
    }


    public double getMedia(){
        double somaNotas = 0.0;
        for(Disciplina d:this.disciplinas){
            System.out.println(d.getNomeDisciplina()+"-------"+d.getNota());
            somaNotas+=d.getNota();
        }
        System.out.println(somaNotas);
        return somaNotas/this.disciplinas.size();
        //return disciplinas.stream().mapToDouble(Disciplina::getNota).average();
    }
    public String getNomeAluno(){
        return this.nomeAluno;
    }

}
