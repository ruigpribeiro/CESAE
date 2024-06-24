package ExerciciosExtra;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // Escreva um programa que peça ao usuário para inserir um número inteiro N e exiba todos os números de 1 até N que são divisíveis por 3 e 5.

        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
