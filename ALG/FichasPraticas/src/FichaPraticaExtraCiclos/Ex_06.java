package FichaPraticaExtraCiclos;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        int num = 0, maior = 0, menor = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Introduza um Número: ");
            num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("Maior Número Introduzido: " + maior);
        System.out.println("Menor Número Introduzido: " + menor);

    }
}
