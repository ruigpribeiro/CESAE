package FichaPraticaExtraCiclos;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        int num1 = 0, num2 = 0, result = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro Número: ");
        num1 = scanner.nextInt();

        System.out.print("Segundo Número: ");
        num2 = scanner.nextInt();


        for (int i = 0; i < num2; i++) {
            result *= num1;
        }

        System.out.println("Resultado: " + result);

    }
}
