import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {

    public static void menuAdmin() throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println();

        do {
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

            String[][] salesMatrix = Admin.readMatrix("Ficheiros/GameStart_Vendas.csv");
            String[][] clientsMatrix = Admin.readMatrix("Ficheiros/GameStart_Clientes.csv");
            String[][] categoriesMatrix = Admin.readMatrix("Ficheiros/GameStart_Categorias.csv");

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

        } while (option != 11);

        scanner.close();
    }

    public static void login() throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        String tipoUtilizador;

        do {
            System.out.print("Tipo de Utilizador (admin/cliente): ");
            tipoUtilizador = scanner.nextLine();

            switch (tipoUtilizador) {
                case "admin":
                    System.out.print("Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Password: ");
                    String password = scanner.nextLine();

                    if (loginCheck("Ficheiros/GameStart_Admins.csv", username, password)) {
                        System.out.println("\nLogin efetuado com sucesso!\n");
                        menuAdmin();
                    } else {
                        System.out.println("\nDados incorretos!");
                    }
                    break;

                case "client":
                    client();

                default:
                    System.out.println("Tipo de utilizador inválido");
                    break;
            }
        } while (!tipoUtilizador.equals("admin") || !tipoUtilizador.equals("client"));

        scanner.close();
    }

    public static void client() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("**** MENU CLIENTE **** ");
        System.out.println("1. Novo Registo");
        System.out.println("2. Procurar Estacionamento");
        System.out.println("3. Imprimir Catálogo");
        System.out.println("4. Imprimir Catálogo Gráfico");
        System.out.println("5. Imprimir Catálogo Editora");
        System.out.println("6. Imprimir Catálogo Categoria");
        System.out.println("7. Imprimir Jogo Mais Recente");

    }

    public static boolean loginCheck(String filePath,String username, String password) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(filePath));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] data = line.split(";");

            if (data[0].equals(username) && data[1].equals(password)) {
                return true;
            }
        }

        scanner.close();
        return false;
    }
}
