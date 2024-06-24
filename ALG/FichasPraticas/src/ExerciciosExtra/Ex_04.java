package ExerciciosExtra;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        int wishNum = 0, num = 0, result = 0, sum = 0, counter = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos número quer inserir: ");
        wishNum = scanner.nextInt();

        while (wishNum > 0) {

            System.out.print("Digite um número: ");
            num = scanner.nextInt();

            sum+= num;
            counter++; // Counter para incrementar o número
            wishNum--;
        }

        result = sum/counter;
        System.out.println(result);
    }
}
