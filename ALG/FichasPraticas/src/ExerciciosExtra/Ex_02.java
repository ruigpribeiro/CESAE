package ExerciciosExtra;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Peça ao usuário para inserir 10 números. Calcule a soma dos números pares e dos números ímpares separadamente e mostre os resultados.

        int num, counter = 0, even = 0, odd = 0;

        Scanner scanner = new Scanner(System.in);

        while (counter != 10) {

            System.out.print("Digite um numero: ");
            num = scanner.nextInt();

            if (num % 2 == 0) {
                even += num;
            }

            if (num % 2 != 0) {
                odd += num;
            }

            counter++;
        }

        System.out.println("Soma números pares: " + even);
        System.out.println("Soma números ímpares: " + odd);
    }
}
