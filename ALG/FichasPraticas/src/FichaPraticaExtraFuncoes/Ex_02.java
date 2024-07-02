package FichaPraticaExtraFuncoes;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        double num1, num2, num3, average;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza um numero: ");
        num1 = sc.nextDouble();

        System.out.print("Introduza um numero: ");
        num2 = sc.nextDouble();

        System.out.print("Introduza um numero: ");
        num3 = sc.nextDouble();

        average = average(num1, num2, num3);
        System.out.print("Média: " + average + "\n");

    }

    public static double average(double num1, double num2, double num3) {

        return (num1 + num2 + num3) / 3;
    }
}
