package FichaPratica03;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {

        int num = 0, factorial = 0, calc = 0;

        // Import Scanner and Request a Number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza um numero: ");
        num = scanner.nextInt();

        do {

            calc = num * (num-1);
            num--;
            factorial = calc * num;

            System.out.println("Factorial: " + factorial);

        } while (num != 1);

        System.out.println(factorial);
    }
}
