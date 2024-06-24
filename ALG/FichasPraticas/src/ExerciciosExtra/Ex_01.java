package ExerciciosExtra;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Escreva um programa que peça ao usuário para inserir um número inteiro positivo e exiba uma contagem regressiva a partir desse número até 0.

        int num = 0;

        // Import do Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        num = scanner.nextInt();

        for (int i = num; i > 0; i--) {
            System.out.println(i);
        }
    }
}
