package FichaPratica05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        int num = 0;
        int[] array = new int[9];

        // Import do Scanner
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            System.out.print("Digite um número: ");
            num = scanner.nextInt();
            array[i] = num;

        }

        for (int i = 0; i < array.length; i++) {

            if (i <= 3) {
                System.out.print(array[i]);
            }

            if (i > 3 && i <= 6) {
                System.out.print(array[i]);
            }

            if (i > 6) {
                System.out.print(array[i]);
            }

        }

    }
}
