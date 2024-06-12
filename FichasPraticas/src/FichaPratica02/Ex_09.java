package FichaPratica02;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        int num1, num2, num3;

        // Import de Scanner e Introduzir inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza o primeiro valor: ");
        num1 = scanner.nextInt();
        System.out.print("Introduza o segundo valor: ");
        num2 = scanner.nextInt();
        System.out.print("Introduza o terceiro valor: ");
        num3 = scanner.nextInt();

        // Logica do menor numero
        if (num1 < num3 && num1 < num2) {
            System.out.println("O numero mais baixo é " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O numero mais baixo é " + num2);
        } else {
            System.out.println("O numero mais baixo é: " + num3);
        }

    }
}
