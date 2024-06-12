package FichaPratica02;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        int num1, num2, result;
        String operChoice;

        // Import Scanner e Introduzir inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza um numero: ");
        num1 = scanner.nextInt();
        System.out.print("Introduza um numero: ");
        num2 = scanner.nextInt();
        System.out.print("Introduza a operação aritmética: Soma (+); Subtracao (-); Divisao (/); Multiplicacao (*): ");
        operChoice = scanner.next();


        // Logica da operaçao aritmetica
        switch (operChoice) {
            case "+":
                result = num1 + num2;
                System.out.println("A soma dos valores é " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("A subtração dos valores é " + result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println("A divisão dos valores é " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("A multiplicação dos valores é " + result);
                break;
            default:
                System.out.println("Erro. Não introduziste o valor correto");
        }
    }
}
