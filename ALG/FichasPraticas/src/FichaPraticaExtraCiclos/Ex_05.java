package FichaPraticaExtraCiclos;

public class Ex_05 {
    public static void main(String[] args) {

        int num = 0;

        for (int i = 0; i < 5; i++) {
            num++;
            for (int j = 0; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }

    }

}
