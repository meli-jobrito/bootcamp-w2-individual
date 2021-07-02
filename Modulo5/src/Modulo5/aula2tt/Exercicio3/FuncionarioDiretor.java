package Modulo5.aula2tt.Exercicio3;

public class FuncionarioDiretor extends Funcionario implements ParticipacaoLucro{
    public FuncionarioDiretor(String id, String nome) {
        super(id, nome);
        this.setSalario(15000.0);
    }



    @Override
    public double participacao(double lucroBruto) {
        return lucroBruto * 0.03;
    }
}
