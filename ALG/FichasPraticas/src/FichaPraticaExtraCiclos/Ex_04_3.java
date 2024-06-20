package FichaPraticaExtraCiclos;

public class Ex_04_3 {
    public static void main(String[] args) {

        String character = "*";

        for (int i = 0; i < 5; i++) {

            int numSpaces = 5 - i - 1;

            for (int j = 0; j < numSpaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= 2 * i; j++) {
                System.out.print(character);
            }

            System.out.println();
        }

    }
}
