package FichaPraticaExtraFuncoes;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        int num1, num2, num3, smaller;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza um numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduza um numero: ");
        num2 = sc.nextInt();

        System.out.print("Introduza um numero: ");
        num3 = sc.nextInt();

        smaller = smallerNumber(num1, num2, num3);
        System.out.println("Menor: " + smaller);


    }

    public static int smallerNumber(int num1, int num2, int num3) {

        if (num1 < num2) {
            if (num1 < num3) {
                return num1;
            }
        }

        if (num2 < num3) {
            return num2;
        }

        return num3;
    }

}
