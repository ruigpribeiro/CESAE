package FichaPratica02;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {

        int num1, num2, num3, first = 0, second = 0, third = 0;
        String choice = "";

        // Import de Scanner e Introduzir inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza um numero: ");
        num1 = scanner.nextInt();
        System.out.print("Introduza um numero: ");
        num2 = scanner.nextInt();
        System.out.print("Introduza um numero: ");
        num3 = scanner.nextInt();
        System.out.print("Ordem Crescente (C) ou Ordem Decrescente (D): ");
        choice = scanner.next();

        // Logica para colocar os numeros crescentes
        switch (choice) {
            case "C":
                if (num1 < num2 && num1 < num3) {
                    first = num1;
                    if (num2 < num3) {
                        second = num2;
                        third = num3;
                    } else {
                        second = num3;
                        third = num2;
                    }
                } else if (num2 < num1 && num2 < num3) {
                    first = num2;
                    if (num1 < num3) {
                        second = num1;
                        third = num3;
                    } else {
                        second = num3;
                        third = num1;
                    }
                } else if (num3 < num2 && num3 < num1) {
                    first = num3;
                    if (num1 < num2) {
                        second = num1;
                        third = num2;
                    } else {
                        second = num2;
                        third = num1;
                    }
                }
                break;
            case "D":
                if (num1 > num2 && num1 > num3) {
                    first = num1;
                    if (num2 > num3) {
                        second = num2;
                        third = num3;
                    } else {
                        second = num3;
                        third = num2;
                    }
                } else if (num2 > num1 && num2 > num3) {
                    first = num2;
                    if (num1 > num3) {
                        second = num1;
                        third = num3;
                    } else {
                        second = num3;
                        third = num1;
                    }
                } else if (num3 > num2 && num3 > num1) {
                    first = num3;
                    if (num1 > num2) {
                        second = num1;
                        third = num2;
                    } else {
                        second = num2;
                        third = num1;
                    }
                }
                break;
        }

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

    }
}
