package FichaPratica05;

public class Ex_05 {
    public static void main(String[] args) {

        int[] array = {164,165,128,88,173,195,75,105,90,140};
        int count = array.length, avg = 0, sum = 0;

        for (int i = 0; i < array.length; i++) {;
            sum += array[i];
            avg = sum / count;
        }

        System.out.println("A média dos elementos é: " + avg);
    }
}
