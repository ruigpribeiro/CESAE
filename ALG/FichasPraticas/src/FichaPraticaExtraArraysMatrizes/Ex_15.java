package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {

        int[][] matriz = new int[3][2];
        int avg, sum = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduza um valor: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sum += matriz[i][j];
            }
        }

        avg = sum / (matriz.length * matriz[0].length);
        System.out.println(avg);

    }
}
