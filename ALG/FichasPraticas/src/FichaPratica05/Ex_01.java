package FichaPratica05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        int[] nums = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Insira um número no Array[" + i + "]: ");
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
