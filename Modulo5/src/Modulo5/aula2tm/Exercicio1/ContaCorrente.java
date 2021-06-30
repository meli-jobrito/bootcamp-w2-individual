package Modulo5.aula2tm.Exercicio1;

public class ContaCorrente {
//    Crie uma classe Conta Corrente, com os métodos: depósito, saque, devolução e transferência.
//    A classe conterá um construtor padrão, um com parâmetros e outro que receberá uma conta corrente da qual copiará
//    todos os seus dados. Além disso, os métodos de acesso devem ser desenvolvidos para cada variável de instância da classe,
//    desenvolvendo um método set e outro método get. Por exemplo: se a classe tem uma variável double saldo,
//    seus métodos de acesso serão: double getSaldo () e void setSaldo (double s)
//    Os protótipos dos métodos e construtores devem ser discutidos e projetados em equipe.

    private String numeroConta;
    private String agencia;
    private double saldo;

    public ContaCorrente(){ //Construtor padrão

    }
    public ContaCorrente(String numeroConta, String agencia, double saldo){//Construtor com parametros
        setNumeroConta(numeroConta);
        setAgencia(agencia);
        this.saldo = saldo;
    }
    public ContaCorrente(ContaCorrente conta){//Construtor de cópia
        setNumeroConta(conta.getNumeroConta());
        setAgencia(conta.getAgencia());
        this.saldo = conta.getSaldo();
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        if(valor<=this.saldo){
            this.saldo -= valor;
            System.out.println("Saque feito com sucesso!\nValor sacado: R$"+valor+"\nSaldo da conta: R$"+this.getSaldo());
        }else{
            System.out.println("Saldo insuficiente - R$"+this.getSaldo());
        }
    }

    public void transfere(ContaCorrente contaDestino, double valor){
        if(valor<=this.saldo){
            this.saldo-=valor;
            contaDestino.deposita(valor);
            System.out.println("Transferência feita com sucesso!\nValor transferido: R$"+valor+"\nSaldo da conta: R$"+this.getSaldo());
        }else{
            System.out.println("Saldo insuficiente - R$"+this.getSaldo());
        }
    }


}
