import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {

    public static void admin(String[][] salesMatrix, String[][] clientsMatrix, String[][] categoriesMatrix) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 11 ) {

            System.out.println("**** MENU ADMIN ****\n");
            System.out.println("1. Imprimir Ficheiro");
            System.out.println("2. Total de Vendas");
            System.out.println("3. Total de Lucro");
            System.out.println("4. Pesquisar Cliente");
            System.out.println("5. Jogo Mais Caro");
            System.out.println("6. Melhores Clientes");
            System.out.println("7. Melhor Categoria");
            System.out.println("8. Pesquisar Vendas");
            System.out.println("9. Top 5 Jogos");
            System.out.println("10. Bottom 5 Jogos");
            System.out.println("11. Sair do programa");
            System.out.print("\nEscolha uma opção: ");
            option = scanner.nextInt();


            switch (option) {
                case 1:
                    Admin.printFiles(salesMatrix, clientsMatrix, categoriesMatrix);
                    break;
                case 2:
                    Admin.totalSales(salesMatrix);
                    break;
                case 3:
                    Admin.totalProfit(salesMatrix);
                    break;
                case 4:
                    Admin.searchClients(clientsMatrix);
                    break;
                case 5:
                    Admin.mostExpensiveGame(salesMatrix, clientsMatrix);
                    break;
                case 6:
                    Admin.bestClients(salesMatrix, categoriesMatrix);
                    break;
                case 7:
                    Admin.bestCategory(salesMatrix, categoriesMatrix);
                    break;
                case 8:
                    Admin.searchByGame(salesMatrix, clientsMatrix);
                    break;
                case 9:
                    Admin.top5Games(salesMatrix, clientsMatrix);
                    break;
                case 10:
                    break;
                case 11:
                    System.out.println("Goodbye que eu good vou");
                    return;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println();

        }
        scanner.close();
    }

    public static void login(String[][] salesMatrix, String[][] clientsMatrix, String[][] categoriesMatrix) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        String tipoUtilizador;

        do {
            System.out.print("Tipo de Utilizador (admin/client): ");
            tipoUtilizador = scanner.nextLine();

            switch (tipoUtilizador) {
                case "admin":
                    if (loginVerification("Ficheiros/GameStart_Admins.csv")) {
                        System.out.println("\nLogin efetuado com sucesso!\n");
                        admin(salesMatrix, clientsMatrix, categoriesMatrix);
                    } else {
                        System.out.println("\nDados incorretos!");
                    }
                    break;
                case "client":
                    client();
                    break;
                default:
                    System.out.println("Tipo de utilizador inválido");
                    break;
            }
        } while (!tipoUtilizador.equals("admin") || !tipoUtilizador.equals("client"));

        scanner.close();
    }

    public static boolean loginVerification(String filePath) throws FileNotFoundException {

        Scanner scannerFile = new Scanner(new File(filePath));
        Scanner scannerInput = new Scanner(System.in);

        System.out.print("Username: ");
        String username = scannerInput.nextLine();
        System.out.print("Password: ");
        String password = scannerInput.nextLine();

        while (scannerFile.hasNextLine()) {
            String line = scannerFile.nextLine();
            String[] data = line.split(";");

            if (data[0].equals(username) && data[1].equals(password)) {
                return true;
            }
        }

        scannerFile.close();
        return false;
    }

    public static void client() {

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n**** MENU CLIENTE ****\n");
            System.out.println("1. Novo Registo");
            System.out.println("2. Procurar Estacionamento");
            System.out.println("3. Imprimir Catálogo");
            System.out.println("4. Imprimir Catálogo Gráfico");
            System.out.println("5. Imprimir Catálogo Editora");
            System.out.println("6. Imprimir Catálogo Categoria");
            System.out.println("7. Imprimir Jogo Mais Recente");
            System.out.print("\nEscolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    //Admin.printFiles(salesMatrix, clientsMatrix, categoriesMatrix);
                    break;
                case 2:
                    Client.searchCarParking();
                    break;
                case 3:
                    //Admin.totalProfit(salesMatrix);
                    break;
                case 4:
                    //Admin.searchClients(clientsMatrix);
                    break;
                case 5:
                    //Admin.mostExpensiveGame(salesMatrix, clientsMatrix);
                    break;
                case 6:
                    //Admin.bestClients(salesMatrix, categoriesMatrix);
                    break;
                case 7:
                    //Admin.bestCategory(salesMatrix, categoriesMatrix);
                    break;
                case 9:
                    System.out.println("Goodbye que eu good vou");
                    return;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println();

        } while (option != 9);

    }
}
