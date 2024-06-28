package FichaPratica06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];
        int sum = 0;

        // Import do Scanner
        Scanner scanner = new Scanner(System.in);

        // Preencher a matriz 1
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print("Introduza um número no Array1: ");
                array1[i][j] = scanner.nextInt();
            }
        }

        // Preencher a matriz 2
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print("Introduza um número no Array2: ");
                array2[i][j] = scanner.nextInt();
            }
        }


        sumArray(array1, array2);
        sum = sumTotal(array1, array2);
        System.out.println(sum);

    }

    public static void sumArray(int[][] array1, int[][] array2) {

        int[][] newArray = new int[array1.length][array1[0].length];

        for (int i = 0; i < newArray.length;i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(newArray));
    }

    public static int sumTotal(int[][] array1, int[][] array2) {

        int sumTotal = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length;j++) {
                sumTotal += array1[i][j];
            }
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length;j++) {
                sumTotal += array2[i][j];
            }
        }
        return sumTotal;
    }
}
