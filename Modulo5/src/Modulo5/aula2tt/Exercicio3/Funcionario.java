package Modulo5.aula2tt.Exercicio3;

public abstract class Funcionario {

    private String id;
    private String nome;
    private double salario;

    public Funcionario( String id, String nome){
        this.setId(id);
        this.setNome(nome);
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculaSalario(){
        return this.getSalario();
    };


}
