package FichaPratica04;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        int option = 0;

        // Import do objeto Scanner
        Scanner scanner = new Scanner(System.in);


        do {
            // Apresentar o Menu
            System.out.println("Menu:");
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");

            System.out.print("Escolha um opção: ");
            option = scanner.nextInt(); // Input do utilizador

            // Switch com lógica para cada escolha
            switch (option) {
                case 1:
                    System.out.println("Escolheste a opção: " + option + "\n");
                    break;
                case 2:
                    System.out.println("Escolheste a opção: " + option + "\n");
                    break;
                case 3:
                    System.out.println("Escolheste a opção: " + option + "\n");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Escolheste uma opção inválida"  + "\n");
            }


        } while (option != 4);

    }
}
