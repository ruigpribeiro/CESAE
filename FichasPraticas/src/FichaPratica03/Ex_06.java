package FichaPratica03;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        int begin = 0, end = 0;

        // Import Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza um numero de inicio: ");
        begin = scanner.nextInt();
        System.out.print("Introduza um numero de fim: ");
        end = scanner.nextInt();

        // Loop to print the integers from x to y
        for (int i = begin; i <= end; i++) {
            System.out.println(i);
        }

    }
}
