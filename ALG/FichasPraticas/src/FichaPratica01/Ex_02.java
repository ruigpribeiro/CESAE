package FichaPratica01;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        int num1, num2, sum, subtract, multiply, divide;

        // scanners para introduzir inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza um número: ");
        num1 = scanner.nextInt();
        System.out.print("Introduza um número: ");
        num2 = scanner.nextInt();

        // calculos aritméticas: soma, subtração, multiplicação e divisão
        sum = num1 + num2;
        subtract = num1 - num2;
        multiply = num1 * num2;
        divide = num1 / num2;

        System.out.println("Soma: " + sum);
        System.out.println("Subtracao: " + subtract);
        System.out.println("Multiplicacao: " + multiply);
        System.out.println("Divisao: " + divide);

    }
}
