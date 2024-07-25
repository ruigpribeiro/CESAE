package ex_01;

public class Triangulo extends FiguraGeometrica {
    private double lado;
    private double base;
    private double altura;

    public Triangulo(String cor, double lado, double base, double altura) {
        super(cor);
        this.lado = lado;
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base + 2 * lado;
    }
}
