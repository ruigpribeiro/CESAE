package TestePratico;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        int temp, num1 = 8, num2 = 10, num3 = 7;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;

            if (num1 > num3) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
        }

        System.out.println(num1 + " " + num2 + " " + num3);

    }

    public static void teste() {
        int contador = 20;

        while (contador > 1) {
            System.out.println(contador);
            contador--;
        }
    }

    public static void teste2() {

        int valor = 2, count = 1;

        while (valor <= 256) {
            System.out.println(valor);
            valor = valor + count;
            count++;
        }

    }

    public static void teste3() {

        int num = 1, sum = 0;

        while (num <= 100) {
            if (num % 2 != 0) {
                sum = sum + num;
            }
        }

        System.out.println("soma " + sum);

    }


}
