package FichaPratica03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        int num;
        String  msg;

        // Import Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza um numero: ");
        num = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Introduza uma mensagem: ");
        msg = scanner.nextLine();

        // Loop to print the message
        for (int i = 1; i <= num; i++) {
            System.out.println(msg);
        }

    }
}
