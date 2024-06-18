package FichaPratica01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        int result, width, length;

        // scanner para introduzir inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza o comprimento: ");
        length = scanner.nextInt();
        System.out.print("Introduza a largura: ");
        width = scanner.nextInt();

        // calculo da area e do perimetro
        result = width * length;
        System.out.println("Area:" + result);
        result = 2*width + 2*length;
        System.out.println("Perimetro: " + result);

    }
}
