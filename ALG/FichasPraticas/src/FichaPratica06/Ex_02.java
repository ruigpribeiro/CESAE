package FichaPratica06;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza um número: ");
        num = scanner.nextInt();

        printNumber(num);

    }

    public static void printNumber(int num) {

        Scanner scanner = new Scanner(System.in);

        while (num <= 0) {

            System.out.print("Introduza um número: ");
            num = scanner.nextInt();
        }

        for (int i = 0; i < num; i++) {
            printAsterisk();
        }
    }

    public static void printAsterisk() {
        System.out.print("*");
    }
}
