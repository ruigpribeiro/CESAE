package FichaPratica05;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        int[] array = new int[5];
        boolean crescente = true;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduza um numero: ");
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < array.length; i++) {

            if (array[i] <= array[i-1]) {
                crescente = false;
            }
        }

        if (crescente) {
            System.out.println("Está em ordem crescente");
        } else {
            System.out.println("Não está em ordem crescente");
        }

    }
}
