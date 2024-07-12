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

    // FUNCIONA
    public static void bestClient(String[][] salesMatrix, String[][] clientsMatrix) throws FileNotFoundException {

        String[][] clientsSpending = new String[clientsMatrix.length][2];

        // Ciclo para preencher a primeira coluna com os ids dos clientes
        for (int i = 0; i < clientsMatrix.length; i++) {
            clientsSpending[i][0] = clientsMatrix[i][0];
            clientsSpending[i][1] = "0";
        }

        // Ciclo para preencher a segunda coluna com o total de vendas dos clientes
        for (int i = 0; i < salesMatrix.length; i++) {
            for (int j = 0; j < clientsSpending.length; j++) {

                if (salesMatrix[i][1].equals(clientsSpending[j][0])) {

                    double currentSpending = Double.parseDouble(clientsSpending[j][1]);
                    double sales = Double.parseDouble(salesMatrix[i][5]);
                    currentSpending += sales;

                    clientsSpending[j][1] = String.valueOf(currentSpending);
                }
            }
        }

        String bestClient = "";
        double mostSpent = 0;

        //Ciclo para encontrar o melhor cliente
        for (int i = 0; i < clientsSpending.length; i++) {

            if (mostSpent < Double.parseDouble(clientsSpending[i][1])) {
                mostSpent = Double.parseDouble(clientsSpending[i][1]);
                bestClient = clientsSpending[i][0];
            }
        }

        // Ciclo para imprimir o cliente que mais gastou
        for (int i = 0; i < clientsMatrix.length; i++) {
            if (clientsMatrix[i][0].equals(bestClient)) {
                System.out.println("\nNome: " + clientsMatrix[i][1] + " | Contacto: " + clientsMatrix[i][2] + " | Email: " + clientsMatrix[i][3]);
                break;
            }
        }
        System.out.println("\nJogos Comprados: ");

        // Ciclo para imprimir todos os jogos comprados
        for (int i = 0; i < salesMatrix.length; i++) {
            if (salesMatrix[i][1].equals(bestClient)) {
                System.out.println(salesMatrix[i][4]);
            }
        }
    }

    // FUNCIONA
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

        System.out.println("\nMelhor Categoria: " + bestCategory + " | Lucro: " + String.format("%.2f", mostProfit) + "€");
    }

    // FUNCIONA
    public static void searchByGame(String[][] salesMatrix, String[][] clientsMatrix) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIntroduza o nome do jogo: ");
        String game = scanner.nextLine();
        System.out.println("\nClientes que compraram: ");

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

    public static String[][] top5Games(String[][] salesMatrix, String[][] categoriesMatrix) throws FileNotFoundException {

        String[][] gamesDuplicated = new String[salesMatrix.length][2];

        // Ciclo para preencher a matriz gamesDuplicated com os todos os jogos e profit do ficheiro vendas
        for (int i = 0; i < salesMatrix.length; i++) {
            String category = salesMatrix[i][3];
            gamesDuplicated[i][0] = salesMatrix[i][4];

            for (int j = 0; j < categoriesMatrix.length; j++) {
                String categoryMargin = categoriesMatrix[j][0];
                double profitMargin = Double.parseDouble(categoriesMatrix[j][1]) / 100;

                if (category.equals(categoryMargin)) {
                    double salesAmount = Double.parseDouble(salesMatrix[i][5]);
                    gamesDuplicated[i][1] = String.valueOf(salesAmount * profitMargin);
                    break;
                }
            }
        }

        String[][] uniqueGames = new String[salesMatrix.length][2];
        int index = 0;
        boolean found;

        // Ciclo para criar uma matriz sem os jogos duplicados
        for (int i = 0; i < gamesDuplicated.length; i++) {
            found = false;
            String game = gamesDuplicated[i][0];

            for (int j = 0; j < uniqueGames.length; j++) {

                if (uniqueGames[j][0] != null && uniqueGames[j][0].equals(game)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                uniqueGames[index][0] = game;
                uniqueGames[index][1] = null;
                index++;
            }
        }

        // Ciclo para preencher o lucro no array uniqueGames
        for (int i = 0; i < uniqueGames.length; i++) {
            double totalProfit = 0;

            for (int j = 0; j < gamesDuplicated.length; j++) {

                if (uniqueGames[i][0] != null && uniqueGames[i][0].equals(gamesDuplicated[j][0])) {
                    totalProfit += Double.parseDouble(gamesDuplicated[j][1]);
                }
            }
            uniqueGames[i][1] = String.valueOf(totalProfit);
        }

        String[][] finalMatrix = new String[index][2];

        for (int i = 0; i < finalMatrix.length; i++) {
            for (int j = 0; j < finalMatrix[i].length; j++) {
                finalMatrix[i][j] = uniqueGames[i][j];
            }
        }

        // Buble sort para ordenar a matriz com base no lucro
        for (int i = 0; i < finalMatrix.length; i++) {
            for (int j = 0; j < finalMatrix.length - i - 1; j++) {

                if (Double.parseDouble(finalMatrix[j][1]) > Double.parseDouble(finalMatrix[j + 1][1])) {
                    String temp = finalMatrix[j][1];
                    finalMatrix[j][1] = finalMatrix[j + 1][1];
                    finalMatrix[j + 1][1] = temp;

                    String game = finalMatrix[j][0];
                    finalMatrix[j][0] = finalMatrix[j + 1][0];
                    finalMatrix[j + 1][0] = game;
                }
            }
        }

        return finalMatrix;
    }
}
