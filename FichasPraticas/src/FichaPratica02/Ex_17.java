package FichaPratica02;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {

        int avgBalance;
        double credit;

        // Import de Scanner e Introduzir os inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saldo Médio: ");
        avgBalance = scanner.nextInt();

        // Mostrar Saldo Médio
        System.out.println("Saldo Médio: " + avgBalance);

        // Calculo do valor de credito atribuido
        if (avgBalance > 2000 && avgBalance <= 4000) {
            credit = avgBalance * 0.2;
            System.out.println("Valor de Crédito: "+ credit);
        } else if (avgBalance > 4000 && avgBalance <= 6000) {
            credit = avgBalance * 0.3;
            System.out.println("Valor de Crédito: "+ credit);
        } else if (avgBalance > 6000) {
            credit = avgBalance * 0.4;
            System.out.println("Valor de Crédito: "+ credit);
        } else {
            System.out.println("Sem Crédito");
        }
    }
}
