package FichaPratica05;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        int[] array = new int[12];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira a comissão do mês " + (i + 1) + ": ");
            array[i] = scanner.nextInt();

            sum += array[i];
        }

        System.out.println("Comissão anual: " + sum);
    }
}
