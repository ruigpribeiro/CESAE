package ex_01;

public abstract class FiguraGeometrica {
    private String cor;

    public FiguraGeometrica(String cor) {
        this.cor = cor;
    }

    public void mostrarCor() {
        System.out.println("A forma geométrica é " + cor);
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

}
