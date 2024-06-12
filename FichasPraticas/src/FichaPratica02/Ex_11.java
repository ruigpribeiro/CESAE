package FichaPratica02;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        int balance, amount;

        // Import de Scanner e Introduzir os inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza saldo médio: ");
        balance = scanner.nextInt();
        System.out.print("Introduza valor a movimentar: ");
        amount = scanner.nextInt();

        // Logica para creditar ou debitar o montante ao saldo bancario
        if (balance + amount < 0) {
            System.out.println("Operação Inválida. Saldo Insuficiente");
            System.out.println("Saldo Atual: " + balance);
        } else {
            balance += amount;
            System.out.println("Saldo Atual: " + balance);
        }

    }
}
