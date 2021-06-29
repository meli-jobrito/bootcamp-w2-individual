package aula2tm.Exercicio4;

public class Mmc {
    //Algoritmo de Euclides iterativo
    private static int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    //Algoritmo do MMC
    public static int calc(int a, int b){
        return a * (b / mdc(a, b));
    }


}
