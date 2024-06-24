package ExerciciosExtra;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        int num = 0, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = sc.nextInt();

        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                sum += i;
            }
        }

        if (num == sum) {
            System.out.println("O número " + num + " é um número perfeito!");
        }
    }
}
