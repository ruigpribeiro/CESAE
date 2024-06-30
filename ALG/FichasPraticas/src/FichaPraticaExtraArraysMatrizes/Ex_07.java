package FichaPraticaExtraArraysMatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        int arraySize = 0, elemToRemove =  0, newArraySize = 0, count = 0;

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

        // Pede ao utilizador para escolher o número que pretende remover da Array
        System.out.print("What number do you want to remove: ");
        elemToRemove = sc.nextInt();

        // Coloca o index que pertence ao número para remover com o valor 0
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elemToRemove) {
                newArraySize++; // Contagem para o tamanho do novo Array
            }
        }

        int[] newArray = new int[newArraySize];

        // Preenche o novo Array sem o número que foi escolhido para ser removido
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elemToRemove) {
                newArray[count] = array[i];
                count++;
            }
        }

        System.out.println(Arrays.toString(newArray));
    }
}
