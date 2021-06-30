package aula2tt.Exercicio2;

public class Triangulo extends GeometricFigure{
    private double altura;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    private double base;

    @Override
    public double area() {
        return (this.altura * this.base)/2;
    }

    @Override
    public String toString() {
        return "Altura do triangulo - "+this.altura+"\nBase do triangulo - "+this.base;
    }
}
