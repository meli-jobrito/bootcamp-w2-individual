package Modulo5.aula2tt.Exercicio3;

public class FuncionarioAnalista extends Funcionario implements Bonificacao{
    //    Analistas possuem bonificação de 8% por meta batida, trabalham uma jornada de 40h horas semanais e possuem 4h de descanso semanal remunerado.
//    O salário base de um analista é de R$ 4.000
    public FuncionarioAnalista(String id, String nome) {
        super(id, nome);
        this.setSalario(4000.0);
    }

    @Override
    public double calculaBonificacao() {
        return this.getSalario() * 0.08;
    }
}
