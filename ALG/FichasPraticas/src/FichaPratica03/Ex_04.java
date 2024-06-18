package FichaPratica03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        int num;

        // Import Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza um numero: ");
        num = scanner.nextInt();

        // Loop to print the integers
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }

    }
}
