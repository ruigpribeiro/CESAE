package FichaPratica06;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        int num = printNumber();
        printAsterisk(num);

    }

    public static int printNumber() {

        int num;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.print("Introduza um número: ");
            num = scanner.nextInt();

        } while (num < 0);

        return num;
    }

    public static void printAsterisk(int num) {

        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
}
