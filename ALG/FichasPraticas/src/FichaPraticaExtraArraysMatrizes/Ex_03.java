package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        int[] array = new int[10];
        int num;
        boolean exist = false;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduza um numero no Array["+i+"]: ");
            array[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.print("Número a pesquisar: ");
        num = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {

            if (array[i] != num) {
                exist = false;
            }
            exist = true;
        }

        if (exist) {
            System.out.println(num + " existe no Array");
        } else {
            System.out.println(num + " não existe no Array");
        }
    }
}
