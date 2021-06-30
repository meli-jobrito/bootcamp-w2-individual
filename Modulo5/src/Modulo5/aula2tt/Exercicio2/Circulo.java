package Modulo5.aula2tt.Exercicio2;

public class Circulo extends GeometricFigure{
    public Circulo(double raio) {
        this.raio = raio;
    }

    private double raio;


    @Override
    public double area() {
        return Math.PI * Math.pow(raio,2);
    }

    @Override
    public String toString() {
        return "Raio do circulo - "+this.raio;
    }
}
