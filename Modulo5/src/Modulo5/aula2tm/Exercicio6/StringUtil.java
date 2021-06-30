package Modulo5.aula2tm.Exercicio6;

public class StringUtil {
    //Partindo da classe StringUtil (que usamos para resolver Radix Sort), agregar os seguintes métodos estáticos:
    //
    //public static String rpad (String s, char c, int n); idem lpad, mas adicionando caracteres à direita.
    //public static String ltrim (String s); Retorna uma string idêntica a s, mas sem espaços à esquerda.
    //public static String rtrim (String s); idem ltrim, mas sem espaços à direita.
    //
    //public static String trim(String s);  idem lpad, mas sem espaços à direita ou à esquerda.
    //
    //public static int indexOfN (String s, char c, int n); Retorna a posição da enésima ocorrência do
    // caractere c em s, ou -1 se s não contiver c. Por exemplo, se s = "John | Paul | George | Ringo", c = ‘|’ e n = 2, a
    // função deve retornar a posição da segunda ocorrência do caractere ‘|’ (barra vertical) dentro da string s. Que, neste caso, é: 9.
    public static String rpad(String texto, char caracter, int repeticoes){
        for(int i = 0; i< repeticoes;i++){
            texto = texto+caracter;
        }
//        texto = texto + String.valueOf(caracter).repeat(repeticoes);
        return texto;
    }

    public static String ltrim(String texto){
        while(texto.startsWith(" ")){
            texto = texto.substring(1);
        }
        return texto;
    }

    public static String rtrim (String texto){
        while(texto.endsWith(" ")){
            texto = texto.substring(0, texto.length()-1);
        }
        return texto;
    }

    public static int indexOfN (String s, char c, int n){
        return s.indexOf(c, n);
    }
}
