package FichaPratica02;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        int num1, num2;

        // Import Scanner e introduzir inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza um numero: ");
        num1 = scanner.nextInt();
        System.out.print("Introduza um numero: ");
        num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.println(num1 + "    " + num2);
        } else if(num1 < num2) {
            System.out.print(num2 + "     " + num1);
        } else {
            System.out.print("São iguais");
        }

    }
}
