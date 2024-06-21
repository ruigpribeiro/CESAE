package FichaPraticaExtraCiclos;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        int num = 0, counterPlus = 0, counterMinus = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Introduza um Número: ");
            num = scanner.nextInt();

            if (num > 0) {
                counterPlus++;
            }
            if (num < 0) {
                counterMinus++;
            }
            if (num == 0) {
                break;
            }
        }

        System.out.println("Quantidade de Números Negativos: " + counterMinus);
        System.out.println("Quantidade de Números Positivos: " + counterPlus);
    }
}
