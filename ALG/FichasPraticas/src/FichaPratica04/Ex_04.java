package FichaPratica04;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        int num = 0, counter = 0;
        boolean prime = false;

        // Import do objeto Scanner
        Scanner scanner = new Scanner(System.in);

        do {

            counter = 0; // Dá reset ao counter

            // Input do utilizador
            System.out.print("Escolha um número: ");
            num = scanner.nextInt();

            for (int i = 1; i <= num; i++) {
                // Verificação se o número é primo e aumenta a contagem dos divisores
                if (num % i == 0) {
                    counter++;
                }
            }

            // Verficação se existe somente 2 divisores
            if (counter == 2) {
                prime = true;
                System.out.println("O número é primo!");
            }

        } while (prime != true);

    }
}
