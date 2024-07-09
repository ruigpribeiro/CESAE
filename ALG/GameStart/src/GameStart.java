import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameStart {
    public static void main(String[] args) {


        try {
            menuAdmin();

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        }

    }

    public static void loginMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tipo de Utilizador (admin/cliente): ");
        String tipoUtilizador = scanner.nextLine();

        switch (tipoUtilizador) {
            case "admin":
                System.out.print("Username: ");
                String username = scanner.nextLine();
                System.out.print("Password: ");
                String password = scanner.nextLine();
                loginCheck(username, password);
            case "client":
                break;
        }
    }

    public static boolean loginCheck(String username, String password) {

        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Login bem sucedido! Bem-vindo " + username);
            return true;
        }

        return false;
    }

    public static void menuAdmin() throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        int option;


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
        System.out.print("\nEscolha uma opção: ");
        option = scanner.nextInt();

        String[][] salesMatrix = Admin.readMatrix("src/Ficheiros/GameStart_Vendas.csv");
        String[][] clientsMatrix = Admin.readMatrix("src/Ficheiros/GameStart_Clientes.csv");
        String[][] categoriesMatrix = Admin.readMatrix("src/Ficheiros/GameStart_Categorias.csv");

        switch (option) {
            case 1:
                int fileOption = fileSecMenu();
                switch (fileOption) {
                    case 1:
                        Admin.printFiles(Admin.readMatrix("src/Ficheiros/GameStart_Vendas.csv"));
                        break;
                    case 2:
                        Admin.printFiles(Admin.readMatrix("src/Ficheiros/GameStart_Clientes.csv"));
                        break;
                    case 3:
                        Admin.printFiles(Admin.readMatrix("src/Ficheiros/GameStart_Categorias.csv"));
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
                break;
            case 2:
                Admin.totalSales(salesMatrix);
                break;
            case 3:
                System.out.println(Admin.totalProfit(salesMatrix));
                break;
            case 4:
                System.out.print("Introduza o ID do Cliente: ");
                String idClient = scanner.next();
                Admin.searchClients(Admin.readMatrix("src/Ficheiros/GameStart_Clientes.csv"), idClient);
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
                System.out.print("Introduza o nome do jogo: ");
                scanner.nextLine();
                String game = scanner.nextLine();
                Admin.searchByGame(salesMatrix, clientsMatrix, game);
                break;
            case 9:
                Admin.top5Games(salesMatrix, clientsMatrix);
        }



    }

    public static int fileSecMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nFicheiros:");
        System.out.println("1. Vendas");
        System.out.println("2. Clientes");
        System.out.println("3. Categorias");
        System.out.print("\nEscolha uma opção: ");

        return scanner.nextInt();
    }

    public static void menuClient() {

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

}