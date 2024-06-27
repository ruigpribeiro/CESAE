package FichaPratica05;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        int[][] array3 = new int[10][2];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Insira um número no Array1[" + i + "]: ");
            array1[i] = sc.nextInt();
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print("Insira um número no Array2[" + i + "]: ");
            array2[i] = sc.nextInt();
        }

        for (int i = 0; i < array3.length; i++) {
            array3[i][0] = array1[i];
            array3[i][1] = array2[i];
        }

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
