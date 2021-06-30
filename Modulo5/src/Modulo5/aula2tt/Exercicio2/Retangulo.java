package Modulo5.aula2tt.Exercicio2;

public class Retangulo extends GeometricFigure{
    private double altura;
    private double comprimento;

    public Retangulo(double altura, double comprimento) {
        this.altura = altura;
        this.comprimento = comprimento;
    }

    @Override
    public double area() {
        return this.altura * this.comprimento;
    }

    @Override
    public String toString() {
        return "Altura do retangulo - "+this.altura+"\nComprimento do retangulo - "+this.comprimento;
    }
}
