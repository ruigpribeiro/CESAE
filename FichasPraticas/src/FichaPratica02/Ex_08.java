package FichaPratica02;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {


        int grade1, grade2, grade3;
        double sum;

        // Import de Scanner e Introduzir inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza a primeira nota: ");
        grade1 = scanner.nextInt();
        System.out.print("Introduza a segunda nota: ");
        grade2 = scanner.nextInt();
        System.out.print("Introduza a terceira nota: ");
        grade3 = scanner.nextInt();

        // Logica da Media Ponderada
        sum = grade1*0.25 + grade2*0.35 + grade3*0.4;

        // Verficicaçao se esta aprovado ou nao
        if (sum >= 9.5) {
            System.out.println("Está aprovado com média pondera de " + sum);
        } else {
            System.out.println("Está repovado com média pondera de " + sum);
        }
    }
}
