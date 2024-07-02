package FichaPraticaExtraFuncoes;

public class Ex_07 {
    public static void main(String[] args) {
        System.out.println(reverseNumber(1623));
    }

    public static int reverseNumber(int num) {

        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum;
    }

}
