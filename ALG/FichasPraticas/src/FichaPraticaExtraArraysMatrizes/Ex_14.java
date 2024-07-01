package FichaPraticaExtraArraysMatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matriz3 = new int[3][3];

        Scanner sc = new Scanner(System.in);

        // Ler matriz 1
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print("Introduza um valor: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        // Ler matriz 2
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print("Introduza um valor: ");
                matriz2[i][j] = sc.nextInt();
            }
        }

        // Somar os valores da matriz1 e matriz2 e guardar na matriz3
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Apresentar matriz3
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print(matriz3[i][j] + "\t\t");
            }
            System.out.println();
        }

    }
}
