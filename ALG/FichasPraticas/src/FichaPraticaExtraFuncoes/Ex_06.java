package FichaPraticaExtraFuncoes;

public class Ex_06 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(361));
    }

    public static double sumOfDigits(int num) {

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
