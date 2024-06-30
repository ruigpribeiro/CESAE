package FichaPraticaExtraArraysMatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        int arraySize = 0, newElement = 0, position = 0;

        // Pede ao utilizador o tamanho da Array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        arraySize = sc.nextInt();

        int[] array = new int[arraySize];

        // Preenchimento da array com inputs dados pelo utilizador
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter an element: ");
            array[i] = sc.nextInt();
        }

        System.out.print("Enter a new element: ");
        newElement = sc.nextInt();
        System.out.print("Enter the position of the element: ");
        position = sc.nextInt();

        int[] newArray = new int[arraySize+1];

        for (int i = 0; i < array.length; i++) {
            if (i < position) {
                newArray[i] = array[i];
            }else {
                newArray[i+1] = array[i];
            }

            newArray[position] = newElement;
        }

        System.out.println(Arrays.toString(newArray));
    }
}
