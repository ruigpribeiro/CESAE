package FichaPratica01;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        int num1, num2, num3, average;
        double  weightedAverage;


        // scanner para introduzir inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza o número: ");
        num1 = scanner.nextInt();
        System.out.print("Introduza o número: ");
        num2 = scanner.nextInt();
        System.out.print("Introduza o número: ");
        num3 = scanner.nextInt();

        // calculo da media
        average = (num1 + num2 + num3) / 3;

        // calculo da media ponderada
        weightedAverage = (num1*0.2 + num2*0.3 + num3*0.5) / 3;

        System.out.println("Média: " + average);
        System.out.println("Média Ponderada: " + weightedAverage);

    }
}
