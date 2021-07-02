package Modulo5.aula2tt.Exercicio3;

public class FuncionarioGerente extends Funcionario implements Bonificacao{

    //    Gerentes possuem bonificação de 12,5% por meta batida, trabalham 36h semanais com 4h de descanso semanal remunerado.
//    O salário base de um gerente é de R$ 6.000.
    public FuncionarioGerente(String id, String nome) {
        super(id, nome);
        this.setSalario(6000.0);
    }

    @Override
    public double calculaBonificacao() {
        return this.getSalario() * 0.125;
    }

}
