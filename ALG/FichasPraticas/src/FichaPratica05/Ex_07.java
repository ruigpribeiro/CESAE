package FichaPratica05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        int num = 0, highEven;
        int[] array = new int[10];

        // Import do Scanner
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite um número: ");
            array[i] = scanner.nextInt();
        }



        highEven = 1;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {

                if (highEven % 2 != 0){
                    highEven = array[i];
                } else {
                    if (array[i]>highEven) {
                        highEven = array[i];
                    }
                }
            }
        }
        if (highEven % 2 != 0) {
            System.out.println("Não tem pares");
        } else {
            System.out.println("Maior par: " + highEven);
        }

    }
}
