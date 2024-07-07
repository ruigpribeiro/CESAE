package FichaPraticaExtraFuncoes;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        String[][] tabuleiro = new String[3][3];
        preencherTabuleiro(tabuleiro);
        mostrarTabuleiro(tabuleiro);
        jogo(tabuleiro);

    }

    public static void mostrarTabuleiro(String[][] tabuleiro) {

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }

    }

    public static String[][] preencherTabuleiro(String[][] tabuleiro) {

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = " ";
            }
        }

        return tabuleiro;

    }

    public static void jogo(String[][] tabuleiro) {

        Scanner sc = new Scanner(System.in);

        int linhaPlayer1, colunaPlayer1, linhaPlayer2, colunaPlayer2;
        boolean vencedor = false;
        String player1 = "X";
        String player2 = "O";

        while (!vencedor) {

            System.out.println();
            System.out.print("Jogador 1, escolha a linha (0, 1 ou 2): ");
            linhaPlayer1 = sc.nextInt();
            System.out.print("Jogador 1, escolha a coluna (0, 1 ou 2): ");
            colunaPlayer1 = sc.nextInt();

            if (linhaPlayer1 >= 0 && linhaPlayer1 <= 2 && colunaPlayer1 >= 0 && colunaPlayer1 <= 2) {
                tabuleiro[linhaPlayer1][colunaPlayer1] = player1;
            } else {
                System.out.println("Escolha inválida!");
            }


            mostrarTabuleiro(tabuleiro);

            System.out.print("Jogador 2, escolha a linha (0, 1 ou 2): ");
            linhaPlayer2 = sc.nextInt();
            System.out.print("Jogador 2, escolha a coluna (0, 1 ou 2): ");
            colunaPlayer2 = sc.nextInt();

            if (linhaPlayer2 >= 0 && linhaPlayer2 <= 2 && colunaPlayer2 >= 0 && colunaPlayer2 <= 2) {
                tabuleiro[linhaPlayer2][colunaPlayer2] = player2;
            } else {
                System.out.println("Escolha inválida!");
            }

            mostrarTabuleiro(tabuleiro);
            verificarVencedor(tabuleiro, player1, player2);

            if (verificarVencedor(tabuleiro, player1, player2)) {
                vencedor = true;
                System.out.println();
                System.out.print("Parabéns, ganhaste!");
            }
        }

    }

    public static boolean verificarVencedor(String[][] tabuleiro, String player1, String player2) {

        for (int i = 0; i < tabuleiro.length; i++) {
            if (tabuleiro[i][0].equals(player1) && tabuleiro[i][1].equals(player1) && tabuleiro[i][2].equals(player1) ||
                    tabuleiro[i][0].equals(player2) && tabuleiro[i][1].equals(player2) && tabuleiro[i][2].equals(player2)) {
                return true;
            }
        }

       if (tabuleiro[0][0].equals(player1) && tabuleiro[1][1].equals(player1) && tabuleiro[2][2].equals(player1) ||
               tabuleiro[0][0].equals(player2) && tabuleiro[1][1].equals(player2) && tabuleiro[2][2].equals(player2)) {
           return true;
       }

        return false;
    }
}