package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        int arraySize = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        arraySize = sc.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter an element to the array: ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
