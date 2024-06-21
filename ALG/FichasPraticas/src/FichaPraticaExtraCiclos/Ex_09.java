package FichaPraticaExtraCiclos;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        int num = 0, sum = 0, result = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza um Número: ");
        num = scanner.nextInt();

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println(sum);
    }
}
