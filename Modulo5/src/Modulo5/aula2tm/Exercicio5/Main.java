package Modulo5.aula2tm.Exercicio5;
import java.text.ParseException;

public class Main {
    //Crie uma classe Data. A classe conterá, além dos construtores que você considera apropriados, métodos de acesso e o
    //método toString, conforme explicamos no exercício anterior, um método para verificar se a data está correta e outro para
    //adicionar um dia ao valor atual da data. A classe GregorianCalendar deve ser investigada e usada para implementar os construtores e métodos Date.

    public static void main(String[] args) throws ParseException {
        Data datinha = new Data("11-07-1996");
        System.out.println(datinha);
        datinha.adicionaDia(10);
        Data.validaData("11-13-1996");
        System.out.println(datinha);

    }
}
