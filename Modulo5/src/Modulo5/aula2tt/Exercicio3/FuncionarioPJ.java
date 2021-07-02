package Modulo5.aula2tt.Exercicio3;

public class FuncionarioPJ extends Funcionario{

    private double valorHora;
    private int horasTrabalhadas;


    public FuncionarioPJ(String id, String nome, double valorHora){
        super(id, nome);
        this.setValorHora(valorHora);
    }

    public FuncionarioPJ(String id, String nome, double valorHora, int horasTrabalhadas){
        super(id, nome);
        this.setValorHora(valorHora);
        this.setHorasTrabalhadas(horasTrabalhadas);
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calculaSalario() {
        return this.getValorHora() * this.getHorasTrabalhadas();
    }
}
