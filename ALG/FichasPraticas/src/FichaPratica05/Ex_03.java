package FichaPratica05;

public class Ex_03 {
    public static void main(String[] args) {

        int[] array = {33,44,22,55,66,88,11,34,56,78};
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("O Maior Número é: " + max);
    }
}
