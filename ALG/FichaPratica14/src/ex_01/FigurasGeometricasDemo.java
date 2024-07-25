package ex_01;

public class FigurasGeometricasDemo {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo("Azul", 5.5, 3.5);
        Circulo circulo = new Circulo("Vermelho", 2);
        Triangulo triangulo = new Triangulo("Verde", 5,3.5, 4.25);

        // Mostrar a cor
        retangulo.mostrarCor();
        circulo.mostrarCor();
        triangulo.mostrarCor();

        // Imprimir a area e perimetro
        retangulo.calcularArea();
        circulo.calcularPerimetro();
        triangulo.calcularArea();
    }
}
