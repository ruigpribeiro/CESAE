package FichaPratica03;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        int num = 0, avg = 0, counter = 0, sum = 0;

        // Import Scanner
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Introduza um numero: ");
            num = scan.nextInt();

            sum += num; // Current number plus last number
            counter++; // Increases the count +1 every loop

        } while (num != -1);

        avg = (sum + 1) / (counter - 1); // Calculating the average
        System.out.println("Média: " + avg);
    }
}
