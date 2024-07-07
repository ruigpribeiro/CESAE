package FichaPraticaExtraFuncoes;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        int terreno = menuInicial();
        int area = dimensoes(terreno);
        int preco = precoTerreno();
        int tipologia = tipologia();
        apresentaTerreno(preco, tipologia, area);

    }

    public static int menuInicial() {

        System.out.println("Qual a forma do terreno:");
        System.out.println("1. Quadrado");
        System.out.println("2. Retangulo");
        System.out.println("3. Triangulo");
        System.out.println("4. Circulo");
        System.out.println();
        System.out.print("Introduza a forma do terreno: ");
        int opcao = lerInputUser();
        System.out.println();

        return opcao;
    }

    public static int dimensoes(int formaTerreno) {

        int num1, num2, result = 0;

        switch (formaTerreno) {
            case 1:
                System.out.print("Qual o tamanho da lateral: ");
                num1 = lerInputUser();
                result = num1 * num1;
                break;
            case 2:
                System.out.print("Qual o tamanho do comprimento: ");
                num1 = lerInputUser();
                System.out.print("Qual o tamanho da largura: ");
                num2 = lerInputUser();
                result = num1 * num2;
                break;
            case 3:
                System.out.print("Qual o tamanho da base: ");
                num1 = lerInputUser();
                System.out.print("Qual o tamanho da altura: ");
                num2 = lerInputUser();
                result = (num1 * num2) / 2;
                break;
            case 4:
                System.out.print("Qual o tamanho do raio: ");
                num1 = lerInputUser();
                result = (int) (3.14 * (num1 * num1));
                break;
            default:
                System.out.println("Opção inválida.");
        }

        return result;

    }

    public static int precoTerreno() {

        System.out.println();
        System.out.print("Qual é o preço do terreno: ");

        return lerInputUser();
    }

    public static int tipologia() {

        System.out.println();
        System.out.println("Tipologia: ");
        System.out.println("1. Urbano");
        System.out.println("2. Urbanizavel");
        System.out.println("3. Rustico");
        System.out.println();
        System.out.print("Introduza a tipologia do terreno: ");

        return lerInputUser();
    }

    public static void apresentaTerreno(int precoTerreno, int tipologia, int area) {

        int precoM2 = precoTerreno / area;

        System.out.println();

        switch (tipologia) {
            case 1:
                if (precoM2 >= 450 && precoM2 <= 750) {
                    System.out.println("Está dentro do valor de mercado.");
                    break;
                } else if (precoM2 > 750) {
                    System.out.println("Está acima do valor de mercado.");
                    break;
                } else {
                    System.out.println("Está abaixo do valor de mercado.");
                    break;
                }
            case 2:
                if (precoM2 >= 150 && precoM2 <= 500) {
                    System.out.println("Está dentro do valor de mercado.");
                    break;
                } else if (precoM2 > 500) {
                    System.out.println("Está acima do valor de mercado.");
                    break;
                } else {
                    System.out.println("Está abaixo do valor de mercado.");
                    break;
                }
            case 3:
                if (precoM2 >= 30 && precoM2 <= 60) {
                    System.out.println("Está dentro do valor de mercado.");
                    break;
                } else if (precoM2 > 60) {
                    System.out.println("Está acima do valor de mercado.");
                    break;
                } else {
                    System.out.println("Está abaixo do valor de mercado.");
                    break;
                }
        }
    }

    public static int lerInputUser() {

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}
