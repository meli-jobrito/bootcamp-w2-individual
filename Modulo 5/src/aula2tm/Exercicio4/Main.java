package aula2tm.Exercicio4;

public class Main {
    //Crie uma classe Fracao com métodos necessários para adicionar, subtrair, multiplicar e dividir frações.
    // Todos os métodos devem ser sobrecarregados para que também possam ser usados para operar entre frações e
    // números inteiros (por exemplo: ⅗ + 2 ou ⅝ * 4).
    public static void main(String[] args) {
        Fracao.soma(10,10,15);
        Fracao.soma(10,10,15,8);
        Fracao.subtracao(25,4,3);
        Fracao.subtracao(25,4,3,2);
        Fracao.multiplicacao(12,7,30,12);
        Fracao.multiplicacao(40,15,10);
        Fracao.divisao(4,12,8,3);
        Fracao.divisao(4,12,8);
    }
}
