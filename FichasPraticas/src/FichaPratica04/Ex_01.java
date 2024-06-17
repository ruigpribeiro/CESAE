package FichaPratica04;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        int num1, num2, result;
        String choice, cha;

        // Import de Scanner
        Scanner scanner = new Scanner(System.in);


        do {
            // Introduzir inputs
            System.out.print("Introduza um numero: ");
            num1 = scanner.nextInt();
            System.out.print("Introduza um numero: ");
            num2 = scanner.nextInt();
            System.out.print("Introduza a operação artimetica (+,-,/,*): ");
            cha = scanner.next();

            // Logica de escolha operaçao aritmetica
            switch (cha) {
                case "+":
                    result = num1 + num2;
                    System.out.println(result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println(result);
                    break;
                case "/":
                    result = num1 / num2;
                    System.out.println(result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println(result);
                    break;
            }

            System.out.println("Deseja continuar? (introduza s/n)");
            choice = scanner.next();

        } while (!choice.equals("s"));
    }
}
