package FichaPraticaExtraCiclos;

public class Ex_04_2 {
    public static void main(String[] args) {

        String character = "*";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }

    }
}
