package FichaPratica02;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        int sal;
        double imp;

        // Import Scanner e introduzir inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza um salario: ");
        sal = scanner.nextInt();

        // Logica de Imposto a Pagar por Range Salarial
        if(sal <= 15000) {
            imp = sal * 0.2;
            System.out.println("Imposto a pagar: " + imp);
        } else if (sal > 15000 && sal <= 20000) {
            imp = sal * 0.3;
            System.out.println("Imposto a pagar " + imp);
        } else if (sal > 20000 && sal <= 25000) {
            imp = sal * 0.35;
            System.out.println("Imposto a pagar " + imp);
        } else {
            imp = sal * 0.4;
            System.out.println("Imposto a pagar " + imp);
        }
    }
}
