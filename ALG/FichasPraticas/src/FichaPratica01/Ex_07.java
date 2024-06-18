package FichaPratica01;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        double price1, price2, price3, total;
        final double DISCOUNT = 0.9;

        // scanner para introduzir inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza o número: ");
        price1 = scanner.nextDouble();
        System.out.print("Introduza o número: ");
        price2 = scanner.nextDouble();
        System.out.print("Introduza o número: ");
        price3 = scanner.nextDouble();

        // calculo do total a pagar com desconto
        total = (price1 + price2 + price3) * DISCOUNT;

        System.out.println("Total a pagar: " + total);
    }
}
