package ExerciciosExtra;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        num = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Sequência de Fibonacci: ");
        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;

        }
    }
}
