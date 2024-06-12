package FichaPratica01;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        double area, radius;
        final double PI = 3.14;

        // scanner para introduzir inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza o raio: ");
        radius = scanner.nextInt();

        // calculo da area da circunferencia
        area = Math.pow((PI * radius), 2);

        System.out.println("Area:" + area);
        System.out.println("Perimetro: " + area);

    }
}
