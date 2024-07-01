package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        int[][] matriz = new int[4][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduza um valor: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
