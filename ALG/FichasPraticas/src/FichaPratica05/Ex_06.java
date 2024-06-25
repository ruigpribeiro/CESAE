package FichaPratica05;

public class Ex_06 {
    public static void main(String[] args) {

        int[] array = {1,3,4,5,3,15,17,19,23,27};
        boolean cres = false;

        for (int i = 0; i < array.length - 1; i++) {
            int next = i+1;

            if (array[i] < array[next]) {
                cres = true;
            } else {
                cres = false;
                break;
            }

        }
        if (cres == true) {
            System.out.println("Está em ordem crescente");
        } else {
            System.out.println("Não está em ordem crescente");
        }

    }
}
