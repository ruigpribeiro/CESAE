package ex_01;

public class Retangulo extends FiguraGeometrica {
    private double comprimento;
    private double largura;

    public Retangulo(String cor, double comprimento, double largura) {
        super(cor);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return comprimento*largura;
    }

    @Override
    public double calcularPerimetro() {
        return comprimento+largura;
    }
}
