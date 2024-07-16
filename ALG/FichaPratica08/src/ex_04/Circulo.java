package ex_04;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double area() {
        return Math.PI * Math.pow(raio, 3);
    }

    public double perimetro() {
        return 2 * Math.PI * raio;
    }
}
