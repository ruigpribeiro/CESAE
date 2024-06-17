package FichaPratica03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        int num = 0, counter0025 = 0, counter2650 = 0, counter5175 = 0, counter76100 = 0;

        // Import Scanner
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Introduza um numero: ");
            num = scan.nextInt();

            if (num <= 25) {
                counter0025++;
            }

            if (num > 25 && num <= 50) {
                counter2650++;
            }

            if (num > 51 && num <= 75) {
                counter5175++;
            }

            if (num > 75 && num <= 100) {
                counter76100++;
            }

            System.out.println(counter0025);
            System.out.println(counter2650);
            System.out.println(counter5175);
            System.out.println(counter76100);

        } while (true);

    }

}
