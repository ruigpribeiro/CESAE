package FichaPratica04;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        int numOne = 0, numTwo = 0, counter = 0;

        // Import do objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Input do utilizador
        System.out.print("Jogador 1, escolha um número entre 0 e 100: ");
        numOne = scanner.nextInt();
        System.out.print("Jogador 2, escolha um número entre 0 e 100: ");
        numTwo = scanner.nextInt();


        do {

            // Apresentar se o número é superior ou inferior
            if (numTwo > numOne) {
                System.out.print("O número escolhido é superior ao número do jogador 1. Escolha outro número: ");
                numTwo = scanner.nextInt();
            } else {
                System.out.print("O número escolhido é inferior ao número do jogador 1. Escolha outro número: ");
                numTwo = scanner.nextInt();
            }

            if (numOne == numTwo) {
                System.out.println("Congratz. Acertaste no número escolhido pelo jogador 1, com " + counter + " tentativas!");
            }


            // Contador de tentativas
            counter++;

        } while (numTwo != numOne);

    }
}
