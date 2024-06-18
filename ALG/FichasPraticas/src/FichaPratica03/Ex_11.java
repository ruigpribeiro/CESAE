package FichaPratica03;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        int limit = 0, skip = 0, counter = 0;

        // Import Scanner and request limit and skip
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza um limite: ");
        limit = scanner.nextInt();
        System.out.print("Introduza um salto: ");
        skip = scanner.nextInt();

        // Loop
        for (int i = 0; i <= limit; i = i + skip) {
            System.out.println(i);
        }

    }
}
