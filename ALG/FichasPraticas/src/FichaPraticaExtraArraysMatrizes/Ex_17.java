package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduza um valor: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int maior = matriz[0][0];
        int menor = matriz[0][0];
        int segundoMaior = matriz[0][0];
        int segundoMenor = matriz[0][0];

        // Procura o maior e o menor valor
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        // Procura o segundo maior e o segundo menor
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] > segundoMaior && matriz[i][j] < maior) {
                    segundoMaior = matriz[i][j];
                }
                if (matriz[i][j] < segundoMenor && matriz[i][j] > menor) {
                    segundoMenor = matriz[i][j];
                }
            }
        }

        System.out.println("Maior: " + maior + " e o segundo maior: " + segundoMaior);
        System.out.println("Menor: " + menor + " e o segundo menor: " + segundoMenor);
    }
}
