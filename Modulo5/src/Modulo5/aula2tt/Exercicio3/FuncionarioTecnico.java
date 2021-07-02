package Modulo5.aula2tt.Exercicio3;

public class FuncionarioTecnico extends Funcionario implements Bonificacao{

    public FuncionarioTecnico(String id, String nome) {
        super(id, nome);
        this.setSalario(3200.0);
    }

    @Override
    public double calculaBonificacao() {
        return this.getSalario() * 0.05;
    }


    //    Técnicos recebem bonificação de 5% por meta batida, trabalham uma jornada de 40h semanais e não têm descanso semanal remunerado.
//    O salário base de um técnico é de R$ 3.200.

}
