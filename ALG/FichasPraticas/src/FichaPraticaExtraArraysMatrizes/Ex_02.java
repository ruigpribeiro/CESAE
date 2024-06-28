package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        int[] array = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduza um numero no Array["+i+"]: ");
            array[i] = scanner.nextInt();
        }

        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
