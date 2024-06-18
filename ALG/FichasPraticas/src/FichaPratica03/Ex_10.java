package FichaPratica03;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        int num = 0;

        // Import Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza um numero: ");
        num = scanner.nextInt();

        // Loop to print the odd numbers between 2 and num
        for (int i = 2; i <= num; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
