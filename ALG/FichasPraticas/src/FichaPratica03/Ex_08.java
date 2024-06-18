package FichaPratica03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        int num;

        // Import Scanner and read a number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza um numero: ");
        num = scanner.nextInt();

        // Loop to print the number from num-5 to num+5
        for (int i = num-5; i <= num+5; i++) {
            // Verification if i == num, then don't print it
            if (i != num) {
                System.out.println(i);
            }
        }
    }
}
