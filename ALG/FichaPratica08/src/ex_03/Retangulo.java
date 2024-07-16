package ex_03;

public class Retangulo {
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public int area() {
        return largura * altura;
    }

    public int perimetro() {
        return 2*largura + 2*altura;
    }
}
