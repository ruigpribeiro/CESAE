package FichaPraticaExtraArraysMatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        int[] array = new int[12];
        boolean isUnique = true;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduza um número: ");
            array[i] = sc.nextInt();
        }

        // Verifica se é único
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                count++;
            }
        }

        int[] newArray = new int[count];
        int index = 0;

        // Novo array com valores únicos
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                newArray[index] = array[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(newArray));
    }
}
