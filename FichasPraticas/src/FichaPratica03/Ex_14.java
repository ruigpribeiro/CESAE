package FichaPratica03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        int totalNum = 0, num = 0, num2 = 0, counter = 1;

        // Import Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos numeros deseja inserir: ");
        totalNum = scanner.nextInt();

        System.out.print("Introduza um numero: ");
        num = scanner.nextInt();

        do {
            System.out.print("Introduza um numero: ");
            num2 = scanner.nextInt();

            // Increase the counter +1
            counter++;

        } while (counter != totalNum);

        // Verification if the next number is higher or lower than the previous one
        if (num2 > num) {
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }

    }
}
