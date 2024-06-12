package FichaPratica02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        int sal;
        double imp;

        // Import Scanner e introduzir inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza um salario: ");
        sal = scanner.nextInt();

        // Logica de impostos a pagar
        if(sal <= 15000) {
            imp = sal * 0.2;
            System.out.println("Paga taxa de 20%: " + imp);
        } else {
            imp = sal * 0.3;
            System.out.println("Paga taxa de 30%: " + imp);
        }

    }
}
