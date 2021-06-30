package Modulo5.aula2tm.Exercicio1;


public class Main {
//    Crie uma classe Conta Corrente, com os métodos: depósito, saque, devolução e transferência.
//    A classe conterá um construtor padrão, um com parâmetros e outro que receberá uma conta corrente da qual copiará
//    todos os seus dados. Além disso, os métodos de acesso devem ser desenvolvidos para cada variável de instância da classe,
//    desenvolvendo um método set e outro método get. Por exemplo: se a classe tem uma variável double saldo,
//    seus métodos de acesso serão: double getSaldo () e void setSaldo (double s)
//    Os protótipos dos métodos e construtores devem ser discutidos e projetados em equipe.

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("1234-5", "1020", 0);
        conta1.deposita(1000);
        conta1.saca(600);
        conta1.saca(600);
        System.out.println("---------- Saldo final da conta 1 ----------");
        System.out.println(conta1.getSaldo());
        ContaCorrente conta2 = new ContaCorrente(conta1);
        conta1.transfere(conta2, 200);
        System.out.println("---------- Saldo final da conta 2 ----------");
        System.out.println(conta2.getSaldo());

    }

}
