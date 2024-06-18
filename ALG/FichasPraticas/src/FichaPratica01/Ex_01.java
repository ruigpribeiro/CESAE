package FichaPratica01;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        int num1, num2, sum;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza um número: ");
        num1 = scanner.nextInt();
        System.out.print("Introduza um número: ");
        num2 = scanner.nextInt();
        sum = num1 + num2;

        System.out.println("Soma: " + sum);

    }
}
