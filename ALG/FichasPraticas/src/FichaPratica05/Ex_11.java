package FichaPratica05;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        int num = 0, higher = 0, lower = 0;
        int[][] array = new int[3][3];

        Scanner sc = new Scanner(System.in);

        // Ciclo para preencher a matriz com os inputs do utilizador
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Digite um valor: ");
                num = sc.nextInt();
                array[i][j] = num;
            }

            higher = array[0][0];
            lower = array[0][0];
        }

        System.out.println(); // Break row visual

        // Ciclo para apresentar a matriz ao utilizador
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(); // Break row visual

        // Ciclo para verificar qual o numero maior da matriz
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] > higher) {
                    higher = array[i][j];
                }

                if (array[i][j] < lower) {
                    lower = array[i][j];
                }
            }
        }

        System.out.println("Higher: " + higher);
        System.out.println("Lower: " + lower);

    }
}
