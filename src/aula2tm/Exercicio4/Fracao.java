package aula2tm.Exercicio4;

public class Fracao {
    //Crie uma classe Fracao com métodos necessários para adicionar, subtrair, multiplicar e dividir frações.
    // Todos os métodos devem ser sobrecarregados para que também possam ser usados para operar entre frações e
    // números inteiros (por exemplo: ⅗ + 2 ou ⅝ * 4).
    public static void soma(int n1, int d1, int n2, int d2){ //Soma entre duas fracoes
        if(d1 == d2){
            System.out.println(n1+"/"+d1+" + "+n2+"/"+d2+" = "+(n1+n2)+"/"+d1);
        }else{
            int nn1, nn2, denominadorComum;
            denominadorComum = Mmc.calc(d1, d2);
            nn1 = (denominadorComum/d1)*n1;
            nn2 = (denominadorComum/d2)*n2;
            System.out.println(n1+"/"+d1+" + "+n2+"/"+d2+" = "+(nn1+nn2)+"/"+denominadorComum);
        }
    }

    public static void soma(int n1, int d1, int inteiro){ //Soma entre fracao e inteiro
        int n2 = inteiro;
        int d2 = 1;
        if(d1 == d2){
            System.out.println(n1+"/"+d1+" + "+n2+"/"+d2+" = "+(n1+n2)+"/"+d1);
        }else{
            int nn1, nn2, denominadorComum;
            denominadorComum = Mmc.calc(d1, d2);
            nn1 = (denominadorComum/d1)*n1;
            nn2 = (denominadorComum/d2)*n2;
            System.out.println(n1+"/"+d1+" + "+n2+"/"+d2+" = "+(nn1+nn2)+"/"+denominadorComum);
        }
    }

    public static void subtracao(int n1, int d1, int n2, int d2){//Subtracao entre fracoes
        if(d1 == d2){
            System.out.println(n1+"/"+d1+" - "+n2+"/"+d2+" = "+(n1-n2)+"/"+d1);
        }else{
            int nn1, nn2, denominadorComum;
            denominadorComum = Mmc.calc(d1, d2);
            nn1 = (denominadorComum/d1)*n1;
            nn2 = (denominadorComum/d2)*n2;
            System.out.println(n1+"/"+d1+" - "+n2+"/"+d2+" = "+(nn1-nn2)+"/"+denominadorComum);
        }
    }

    public static void subtracao(int n1, int d1, int inteiro){//Subtracao entre fracao e inteiro
        int n2 = inteiro;
        int d2 = 1;
        if(d1 == d2){
            System.out.println(n1+"/"+d1+" - "+n2+"/"+d2+" = "+(n1-n2)+"/"+d1);
        }else{
            int nn1, nn2, denominadorComum;
            denominadorComum = Mmc.calc(d1, d2);
            nn1 = (denominadorComum/d1)*n1;
            nn2 = (denominadorComum/d2)*n2;
            System.out.println(n1+"/"+d1+" - "+n2+"/"+d2+" = "+(nn1-nn2)+"/"+denominadorComum);
        }
    }

    public static void multiplicacao(int n1, int d1, int n2, int d2){ //Multiplicacao entre fracoes
        System.out.println(n1+"/"+d1+" * "+n2+"/"+d2+" = "+(n1*n2)+"/"+(d1*d2));
    }

    public static void multiplicacao(int n1, int d1, int inteiro){ //Multiplicacao entre fracao e inteiro
        int n2 = inteiro;
        int d2 = 1;
        System.out.println(n1+"/"+d1+" * "+n2+"/"+d2+" = "+(n1*n2)+"/"+(d1*d2));
    }

    public static void divisao(int n1, int d1, int n2, int d2){//Divisao entre fracoes
        System.out.println(n1+"/"+d1+" * "+n2+"/"+d2+" = "+(n1*d2)+"/"+(n2*d1));
    }

    public static void divisao(int n1, int d1, int inteiro){//Divisao entre fracao e inteiro
        int n2 = inteiro;
        int d2 = 1;
        System.out.println(n1+"/"+d1+" * "+n2+"/"+d2+" = "+(n1*d2)+"/"+(n2*d1));
    }
}
