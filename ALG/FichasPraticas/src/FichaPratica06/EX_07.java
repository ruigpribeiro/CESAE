package FichaPratica06;

import java.util.Scanner;

public class EX_07 {
    public static void main(String[] args) {

        String character = "";
        int rows = 0, cols = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza um caracter: ");
        character = scanner.next();

        System.out.print("Introduza número de linhas: ");
        rows = scanner.nextInt();

        System.out.print("Introduza número de colunas: ");
        cols = scanner.nextInt();


        drawSquare(character, rows,cols);

    }

    public static void drawSquare(String character,int rows, int cols) {

        // Parte de Cima
        for (int i = 0; i < cols; i++) {
            System.out.print(character);
        }
        System.out.println();

        // Parte do Meio
        for (int i = 2; i < rows; i++) {
            System.out.print(character);
            for (int j = 0; j < rows; j++) {
                System.out.print(" ");
            }
            System.out.println(character);
        }

        // Parte de Baixo
        for (int i = 0; i < cols; i++) {
            System.out.print(character);
        }
        System.out.println();
    }
}
