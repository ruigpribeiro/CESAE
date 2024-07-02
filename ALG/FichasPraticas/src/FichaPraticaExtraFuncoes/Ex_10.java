package FichaPraticaExtraFuncoes;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        menuForma(userInputNum());
        menuDimensoes(userInputNum());
        menuPrecoTipologia(userInputNum(), userInputNum());

    }

    public static int menuForma(int num) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("***** MENU *****");
        System.out.println("1. Quadrado");
        System.out.println("2. Retângulo");
        System.out.println("3. Triangular");
        System.out.println("4. Circular");

        System.out.print("Qual a forma do seu terreno: ");
        num = scanner.nextInt();

        return num;
    }

    public static void menuDimensoes(int num) {

        if (menuForma(num) == 1) {
            System.out.print("Introduza o valor do lado: ");
            userInputNum();
        }
        if (menuForma(num) == 2) {
            System.out.print("Introduza o valor do comprimento: ");
            userInputNum();
            System.out.print("Introduza o valor da largura: ");
            userInputNum();
        }
        if (menuForma(num) == 3) {
            System.out.print("Introduza o valor da base: ");
            userInputNum();
            System.out.print("Introduza o valor da altura: ");
            userInputNum();
        }
        if (menuForma(num) == 4) {
            System.out.print("Introduza o valor do raio: ");
            userInputNum();
        }
    }

    public static void menuPrecoTipologia(int num1, int num2) {

        System.out.print("Introduza o preço do terreno: ");
        num1 = userInputNum();
        System.out.println();

        System.out.print("Introduza a tipologia:");
        System.out.print("1. Urbano");
        System.out.print("2. Urbanizavel");
        System.out.print("3. Rusticos");
        num2 = userInputNum();
    }

    public static int userInputNum() {

       int num;

       Scanner scanner = new Scanner(System.in);
       num = scanner.nextInt();

       return num;
    }
}
