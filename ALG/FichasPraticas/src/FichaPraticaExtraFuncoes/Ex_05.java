package FichaPraticaExtraFuncoes;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        int numJoke;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza um número para ouvir uma piada: ");
        numJoke = sc.nextInt();

        System.out.print(tellAJoke(numJoke));

    }

    public static String tellAJoke(int joke) {

        String[] jokes = {"Qual é a panela que está sempre triste? A panela depressão.",
        "O que acontece se o Pai Natal morrer? Ele não estará mais em trenós.",
        "Que nome se dá a uma ferramenta perdidade? Foice.",
        "O que 17 alentejanos fazem em frente ao cinema? À espera que chegue mais um porque" +
                "o filme é para mais de 18."};

        for (int i = 0; i < jokes.length; i++) {
            if (i == joke) {
                return jokes[i];
            }
        }

        return "A biblioteca de piadas só tem " + (jokes.length - 1) + " piadas.";
    }
}
