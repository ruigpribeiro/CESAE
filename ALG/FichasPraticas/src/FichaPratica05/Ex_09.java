package FichaPratica05;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        int num = 0, sum = 0;
        int[][] array = new int[5][5];

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
                sum += array[j][j];
            }
        }

        System.out.println(sum);
    }
}
