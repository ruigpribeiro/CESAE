package FichaPratica05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        int num = 0, repeat = 0, count = 0;
        int[][] array = new int[3][5];

        Scanner sc = new Scanner(System.in);

        // Ciclo para preencher o array com os numeros introduzidos pelo utilizador
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Digite um valor: ");
                num = sc.nextInt();
                array[i][j] = num;
            }
        }

        System.out.println(); // Break row visual

        // Ciclo para apresentar os numeros da matriz
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(); // Break row visual

        System.out.print("Digite um valor: ");
        repeat = sc.nextInt();

        // Ciclo para verificar quantas vezes o numero repetido introduzido se encontra na matriz
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == repeat) {
                    count++;
                }
            }
        }

        System.out.println("Há " + count + " posições na matriz com o número " + repeat);


        // System.out.println(Arrays.deepToString(array));
    }
}
