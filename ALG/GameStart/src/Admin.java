import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Admin {

    public static void printFiles(String[][] file) throws FileNotFoundException {

        for (int i = 0; i < file.length; i++) {
            for (int j = 0; j < file[i].length; j++) {
                System.out.print(file[i][j] + " ");
            }
            System.out.println();
        }
    }

    // FUNCIONA
    public static void printFiles(String[][] sales, String[][] clients, String[][] categories) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nFicheiros: \n1. Vendas\n2. Cliente\n3. Categorias");
        /*
        System.out.println("1. Vendas");
        System.out.println("2. Clientes");
        System.out.println("3. Categorias");
        System.out.print("\nEscolha uma opção: ");

         */

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                printFiles(sales);
                break;
            case 2:
                printFiles(clients);
                break;
            case 3:
                printFiles(categories);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    // FUNCIONA
    public static void totalSales(String[][] sales) throws FileNotFoundException {

        int count = 0;
        double total = 0;

        for (int i = 0; i < sales.length; i++) {
            total += Double.parseDouble(sales[i][5]);
            count++;
            break;
        }

        System.out.println("Quantidade de Vendas: " + count + " | Valor Total: " + String.format("%.2f", total) + "€");

    }

    // FUNCIONA
    public static void totalProfit(String[][] sales) throws FileNotFoundException {

        double totalProfit = 0;
        String[][] categories = GameStart.readMatrix("Ficheiros/GameStart_Categorias.csv");

        for (int i = 0; i < sales.length; i++) {

            String category = sales[i][3];
            double price = Double.parseDouble(sales[i][5]);

            for (int j = 0; j < categories.length; j++) {

                String categoryMargin = categories[j][0];
                double profitMargin = (Double.parseDouble(categories[j][1]) / 100);

                if (category.equals(categoryMargin)) {
                    totalProfit = totalProfit + (price * profitMargin);
                    break;
                }
            }
        }
        System.out.println("Total de Lucro: " + String.format("%.2f", totalProfit) + "€");
    }

    // FUNCIONA
    public static void searchClients(String[][] sales) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza o ID do Cliente: ");
        String idClient = scanner.next();

        for (int i = 0; i < sales.length; i++) {
            String clientID = sales[i][0];

            for (int j = 0; j < sales[i].length; j++) {
                if (clientID.equals(idClient)) {
                    System.out.println("Cliente: " + sales[i][1] + " | Contacto: " + sales[i][2] + " | Email: " + sales[i][3]);
                    break;
                }
            }
        }

    }

    // FUNCIONA
    public static void mostExpensiveGame(String[][] salesMatrix, String[][] clientsMatrix) throws FileNotFoundException {

        String mostExpensive = "";
        double currentPrice = 0;

        for (int i = 0; i < salesMatrix.length; i++) {

            double price = Double.parseDouble(salesMatrix[i][5]);

            if (price > currentPrice) {
                currentPrice = price;
                mostExpensive = salesMatrix[i][4];
            }
        }

        System.out.println("\nJogo mais caro: " + mostExpensive + "\n");

        for (int i = 0; i < salesMatrix.length; i++) {
            String game = salesMatrix[i][4];

            if (game.equals(mostExpensive)) {
                for (int j = 0; j < clientsMatrix.length; j++) {

                    if (clientsMatrix[j][0].equals(salesMatrix[i][1])) {
                        System.out.println("Nome: " + clientsMatrix[j][1] + " | Contacto: " + clientsMatrix[j][2] + " | Email: " + clientsMatrix[j][3]);
                    }
                }
            }
        }

    }

    public static void bestClients(String[][] salesMatrix, String[][] clientsMatrix) throws FileNotFoundException {
        // COMPLETAR
    }

    public static void bestCategory(String[][] salesMatrix, String[][] categoryMatrix) throws FileNotFoundException {

        String[][] profitPerCategory = new String[categoryMatrix.length][2];

        // Ciclo para preencher a matriz profitPerCategory com as categorias corretas
        for (int i = 0; i < categoryMatrix.length; i++) {
            profitPerCategory[i][0] = categoryMatrix[i][0];
            profitPerCategory[i][1] = "0";
        }

        // Ciclo para preencher a matriz profitPerCategory com o profit por categoria
        for (int i = 0; i < salesMatrix.length; i++) {
            for (int j = 0; j < categoryMatrix.length; j++) {

                if (profitPerCategory[j][0].equals(salesMatrix[i][3])) {

                    double profit = Double.parseDouble(salesMatrix[i][5]) * (Double.parseDouble(categoryMatrix[j][1]) / 100);
                    double currentProfit = Double.parseDouble(profitPerCategory[j][1]);
                    profitPerCategory[j][1] = String.valueOf(currentProfit + profit);
                    break;
                }
            }
        }

        String bestCategory = "";
        double mostProfit = 0;

        // Ciclo para encontrar a categoria mais lucrativa
        for (int i = 0; i < profitPerCategory.length; i++) {
            for (int j = 0; j < profitPerCategory[i].length; j++) {
                if (mostProfit < Double.parseDouble(profitPerCategory[i][1])) {
                    mostProfit = Double.parseDouble(profitPerCategory[i][1]);
                    bestCategory = profitPerCategory[i][0];
                }
            }
        }

        System.out.println("Melhor Categoria: " + bestCategory + " | Lucro: " + mostProfit);
    }

    public static void searchByGame(String[][] salesMatrix, String[][] clientsMatrix) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza o nome do jogo: ");
        String game = scanner.nextLine();

        for (int i = 0; i < salesMatrix.length; i++) {
            if (salesMatrix[i][4].equals(game)) {
                String clientId = salesMatrix[i][1];
                for (int j = 0; j < clientsMatrix.length; j++) {
                    if (clientsMatrix[j][0].equals(clientId)) {
                        System.out.println("Nome: " + clientsMatrix[j][1] + " | Contacto: " + clientsMatrix[j][2] + " | Email: " + clientsMatrix[j][3]);
                        break;
                    }
                }
            }
        }
    }

    public static void top5Games(String[][] salesMatrix, String[][] clientsMatrix) throws FileNotFoundException {

        int counter = 0;

        for (int i = 0; i < salesMatrix.length - 1; i++) {
            boolean unique = true;

            for (int j = 0; j < salesMatrix[i].length - 1; j++) {

                if (!salesMatrix[i][4].equals(salesMatrix[i + 1][4])) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                counter++;
            }
        }


        // SAO A VOLTA DE 81 JOGOS
    }

    // PARA O TOP TALVEZ UTILIZAR O BUBLE SHORT PARA REORDENAR A ARRAY POR VALORES E DEPOIS IMPRIMIR
}
