package FichaPraticaExtraFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        System.out.println(vowel(userInput().toLowerCase()));

    }

    public static boolean vowel(String text) {

        if (text.equals("a") || text.equals("e") || text.equals("i") || text.equals("o") || text.equals("u")) {
            return true;
        }

        return false;
    }

    public static String userInput() {

        String text;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza uma letra: ");
        text = sc.next();

        return text;
    }
}
