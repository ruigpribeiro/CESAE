package FichaPratica02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        int num1, num2;

        // Import de Scanner e introduzir os inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza horas: ");
        num1 = scanner.nextInt();
        System.out.print("Introduza minutos: ");
        num2 = scanner.nextInt();

        // Logica para transformaçao de horario 24 horas para 12 horas
        if (num1 > 11 && num1 < 23) {
            switch (num1) {
                case 12:
                    System.out.println("00:" + num2 + " PM");
                    break;
                case 13:
                    System.out.println("1:" + num2 + " PM");
                    break;
                case 14:
                    System.out.println("2:" + num2 + " PM");
                    break;
                case 15:
                    System.out.println("3:" + num2 + " PM");
                    break;
                case 16:
                    System.out.println("4:" + num2 + " PM");
                    break;
                case 17:
                    System.out.println("5:" + num2 + " PM");
                    break;
                case 18:
                    System.out.println("6:" + num2 + " PM");
                    break;
                case 19:
                    System.out.println("7:" + num2 + " PM");
                    break;
                case 20:
                    System.out.println("8:" + num2 + " PM");
                    break;
                case 21:
                    System.out.println("9:" + num2 + " PM");
                    break;
                case 22:
                    System.out.println("10:" + num2 + " PM");
                    break;
                case 23:
                    System.out.println("11:" + num2 + " PM");
                    break;
            }
        } else {
            System.out.println(num1 + ":" + num2 + " AM");
        }

    }
}
