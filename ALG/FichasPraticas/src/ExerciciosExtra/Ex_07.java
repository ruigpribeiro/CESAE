package ExerciciosExtra;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        String cha;
        boolean palin = true;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        cha = sc.next();

        for (int i = 0; i < cha.length() / 2; i++) {
            if (cha.charAt(i) != cha.charAt(cha.length() - i - 1)) {
                palin = false;
                break;
            }
        }

        if (palin) {
            System.out.println("A palavra " + cha + " é um palíndromo.");
        } else {
            System.out.println("A palavra " + cha + " não é um palíndromo.");
        }

    }
}
