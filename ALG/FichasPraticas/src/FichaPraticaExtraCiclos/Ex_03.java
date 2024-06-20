package FichaPraticaExtraCiclos;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        int result = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("\nTabuada do " + i);

            for (int j = 1; j <= 10; j++) {
                result = i*j;
                System.out.println(i + "x" + j + " = " + result);
            }

        }

    }
}
