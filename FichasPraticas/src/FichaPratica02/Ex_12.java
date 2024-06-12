package FichaPratica02;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        int choice;

        // Import de Scanner e introduzir os inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu: \n1. Criar \n2. Atualizar \n3. Eliminar \n4. Sair");
        choice = scanner.nextInt();

        // Logica para apresentar a escolha
        switch (choice) {
            case 1:
                System.out.println("Opção escolhida: " + choice);
                break;
            case 2:
                System.out.println("Opção escolhida: " + choice);
                break;
            case 3:
                System.out.println("Opção escolhida: " + choice);
                break;
            case 4:
                break;
            default:
                System.out.println("Escolha Inválida");

        }

    }
}
