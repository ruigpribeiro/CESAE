package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        int[] array = new int[12];
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduza um numero no Array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
