package FichaPratica02;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {

        int amount, result = 0, amountLeft = 0, counter = 0;

        // Import de Scanner e Introduzir os inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza um valor em euros: ");
        amount = scanner.nextInt();

        // Calculo menor numero possivel
        if (amount >= 200) {
            result = amount / 200;
            amountLeft = amount - result*200;
            counter += result;
        }

        if (amountLeft >= 100) {
            result = amountLeft / 100;
            amountLeft -= result*100;
            counter += result;
        }

        if (amountLeft >= 50) {
            result = amountLeft / 50;
            amountLeft -= result*50;
            counter += result;
        }

        if (amountLeft >= 20) {
            result = amountLeft / 20;
            amountLeft -= result*20;
            counter += result;
        }

        if (amountLeft >= 10) {
            result = amountLeft / 10;
            amountLeft -= result*10;
            counter += result;
        }

        if (amountLeft >= 5) {
            result = amountLeft / 5;
            amountLeft -= result*5;
            counter += result;
        }

        System.out.println(counter);
    }
}
