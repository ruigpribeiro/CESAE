package FichaPratica05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        int num = 0, highEven = 0;
        int[] array = new int[10];

        // Import do Scanner
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            System.out.print("Digite um número: ");
            num = scanner.nextInt();

            array[i] = num;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {

                if (array[i] > highEven){
                    highEven = array[i];
                }
            }
        }
        if (highEven != 0) {
            System.out.println(highEven);
        } else {
            System.out.println("There's not an even number");
        }

    }
}
