package ExerciciosExtra;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        
        int numOne, numTwo, result = 0;
        String operation = "";
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numOne = sc.nextInt();
        System.out.print("Digite um numero: ");
        numTwo = sc.nextInt();
        System.out.print("Digite um operador: ");
        operation = sc.next();
        
        switch (operation) {
            case "+":
                result = numOne + numTwo;
                break;
            case "-":
                result = numOne - numTwo;
                break;
            case "*":
                result = numOne * numTwo;
                break;
            case "/":
                result = numOne / numTwo;
                break;
        }

        System.out.println("O resultado da operação é: " + result);
    }
}
