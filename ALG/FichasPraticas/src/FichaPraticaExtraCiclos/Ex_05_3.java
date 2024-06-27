package FichaPraticaExtraCiclos;

public class Ex_05_3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            int numSpaces = 5 - i;

            // Ciclo para aumentar espaços
            for (int j = 0; j < numSpaces; j++) {
                System.out.print(" ");
            }

            // Ciclo para descrescer
            for (int j = i; j > 1; j--) {
                System.out.print(j);
            }

            // Ciclo para crescer
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            System.out.println();
        }


    }
}
