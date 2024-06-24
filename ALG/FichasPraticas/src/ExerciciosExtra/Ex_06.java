package ExerciciosExtra;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            System.out.println(i * i);

        }
    }
}
