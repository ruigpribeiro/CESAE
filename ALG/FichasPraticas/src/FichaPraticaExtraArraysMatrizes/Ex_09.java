package FichaPraticaExtraArraysMatrizes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        int[] array = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduza um número: ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
