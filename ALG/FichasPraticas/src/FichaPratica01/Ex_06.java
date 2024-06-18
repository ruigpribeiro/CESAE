package FichaPratica01;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        int valor1, valor2;

        // scanner para introduzir inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza o número: ");
        valor1 = scanner.nextInt();
        System.out.print("Introduza o número: ");
        valor2 = scanner.nextInt();

       valor1 = valor2 + valor1;
       valor2 = valor1 - valor2;
       valor1 = valor1 - valor2;

        System.out.println("Valor1: " + valor1);
        System.out.println("Valor2: " + valor2);


    }
}
