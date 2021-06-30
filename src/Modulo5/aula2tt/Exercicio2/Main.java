package Modulo5.aula2tt.Exercicio2;

import java.util.ArrayList;

public class Main {
    //Crie a classe GeometricFigure, abstrata e com o método: public abstract double area ();
    //
    //Substitua corretamente o método toString. Discussão em grupo: faz sentido substituir o método toString em uma classe abstrata?
    //
    //Crie as classes Círculo, Triângulo e Retângulo, todas subclasses de Figura Geométrica. Que erro de compilação aparece? Como você resolveria isso?
    //
    //Adicione os atributos (variáveis de instância) que correspondem em cada caso e
    //substitua adequadamente o método de área em todas as subclasses de GeometricFigure.
    //
    //Crie uma classe de utilidade com um método estático: public static double areaMedia (GeometricFigure arr []), que
    //calcula e retorna a área média das figuras contidas no array. Crie um programa, instancie um array de GeometricFigure [], carregue
    //os dados nele e execute o método areaMedia para obter a área média. Mostre o resultado.

    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        System.out.println("Area do circulo - "+circulo.area());
        Retangulo retangulo = new Retangulo(10,20);
        System.out.println("Area do retangulo - "+retangulo.area());
        Triangulo triangulo = new Triangulo(15,8);
        System.out.println("Area do triangulo - "+triangulo.area());

        ArrayList<GeometricFigure> lista = new ArrayList<GeometricFigure>();
        lista.add(circulo);
        lista.add(retangulo);
        lista.add(triangulo);
        System.out.println("Média das areas das figuras criadas - "+Util.areaMedia(lista));
    }
}
