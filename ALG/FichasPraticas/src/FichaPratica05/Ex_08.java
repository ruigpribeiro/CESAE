package FichaPratica05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        int num = 0;
        int[][] array = new int[3][3];

        // Import do Scanner
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Digite um valor: ");
                num = scanner.nextInt();
                array[i][j] = num;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
