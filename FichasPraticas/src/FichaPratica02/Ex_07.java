package FichaPratica02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        int num;

        // Import de Scanner e Introduzir inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza um numero: ");
        num = scanner.nextInt();

        // Logica se é par ou impar
        if (num % 2 == 0) {
            System.out.println("O numero introduzido é par");
        } else {
            System.out.println("O numero introduzido é impar");
        }
    }
}
