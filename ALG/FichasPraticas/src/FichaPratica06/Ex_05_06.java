package FichaPratica06;

import java.util.Scanner;

public class Ex_05_06 {
    public static void main(String[] args) {

        int arraySize = 0, num = 0, option = 0;

        // Input dado pelo utilizador para o tamanho do array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o tamanho do vetor: ");
        arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        // Input dado pelo utilizador para preencher o array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduza um número: ");
            num = scanner.nextInt();
            array[i] = num;
        }

        // Menu de opções
        System.out.println();
        System.out.println("Menu:");
        System.out.println("7. Maior Elemento");
        System.out.println("8. Menor Elemento");
        System.out.println("9. Crescente ou Não Crescente");
        System.out.println();
        System.out.print("Escolha uma opção: ");
        option = scanner.nextInt();

        switch (option) {
            case 7:
                System.out.println(higherValue(array));
                break;
            case 8:
                System.out.println(lowerValue(array));
                break;
            case 9:
                if (isIncreasing(array)) {
                    System.out.println("Crescente");
                } else {
                    System.out.println("Não crescente");
                }
                break;
        }

    }

    public static int higherValue(int[] array) {

        int higher = array[0];

        for (int i = 0; i < array.length; i++){

            if (array[0] < array[i]) {
                higher = array[i];
            }
        }

        return higher;
    }

    public static int lowerValue(int[] array) {

        int lower = array[0];

        for (int i = 0; i < array.length; i++){

            if (array[0] > array[i]) {
                lower = array[i];
            }
        }

        return lower;
    }

    public static boolean isIncreasing(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] >= array[i+1]) {
                return false;
            }
        }

        return true;
    }


}
