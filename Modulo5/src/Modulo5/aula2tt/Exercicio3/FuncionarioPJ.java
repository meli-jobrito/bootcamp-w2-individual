package Modulo5.aula2tt.Exercicio3;

public class FuncionarioPJ extends Funcionario{

    private double valorHora;

    public FuncionarioPJ(String id, String nome, double valorHora){
        super(id, nome);
        this.setValorHora(valorHora);
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calculaSalario(int horasTrabalhadas) {
        return horasTrabalhadas * this.getValorHora();
    }
}
