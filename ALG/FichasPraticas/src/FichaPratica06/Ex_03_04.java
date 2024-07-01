package FichaPratica06;

import java.util.Scanner;

public class Ex_03_04 {
    public static void main(String[] args) {

        int num, option;

        Scanner scanner = new Scanner(System.in);

        // Pede ao utilizador um numero
        System.out.print("Introduza um número: ");
        num = scanner.nextInt();
        System.out.println();

        // Apresenta um menu de opções
        System.out.println("Menu:");
        System.out.println("1. Par ou Ímpar");
        System.out.println("2. Positivo ou Negativo");
        System.out.println("3. Primo ou Não Primo");
        System.out.println("4. Perfeito ou Não Perfeito");
        System.out.println("5. Triangular ou Não Triangular");
        System.out.println("6. Trocar de Número");
        System.out.println();

        System.out.print("Escolha uma opção: ");
        option = scanner.nextInt();
        menu(option, num);
    }

    public static void menu(int option, int num) {

        Scanner scanner = new Scanner(System.in);


        switch (option) {
            case 1:
                if (isOdd(num)){
                    System.out.println("Par");
                } else {
                    System.out.println("Ímpar");
                }
                break;
            case 2:
                if (isPositive(num)) {
                    System.out.println("Positivo");
                } else {
                    System.out.println("Negativo");
                }
                break;
            case 3:
                if (isPrime(num)) {
                    System.out.println("Primo");
                } else {
                    System.out.println("Não Primo");
                }
                break;
            case 4:
                if (isPerfect(num)) {
                    System.out.println("Perfeito");
                } else {
                    System.out.println("Não Perfeito");
                }
                break;
            case 5:
                if (isTriangular(num)) {
                    System.out.println("Triangular");
                } else {
                    System.out.println("Não Triangular");
                }
                break;
            case 6:
                System.out.println();
                System.out.print("Introduza um novo número: ");
                num = scanner.nextInt();
                System.out.print("Escolha uma opção: ");
                option = scanner.nextInt();
                menu(option, num);
                break;
        }
    }

    /**
     * Verifica se é par
     * @param num
     * @return true se par, false se ímpar
     */
    public static boolean isOdd(int num) {

        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isPositive(int num) {

        if (num >= 0) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfect(int num) {

        int sum = 0;

        for (int i = 1 ; i < num; i++) {

            if (num % i == 0) {
                sum += i;
            }
        }

        return num == sum;
    }

    public static boolean isTriangular(int num) {

        int sum = 0;

        for (int i = 1; i < num; i++) {
            sum += i;

            if (num == sum) {
                break;
            }
        }

        return sum == num;
    }


}
