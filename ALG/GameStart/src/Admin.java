import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Admin {

    public static String[][] readMatrix(String filePath) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(filePath));
        String headerLine = scanner.nextLine(); // Linha do cabeçalho

        int arrayLength = 0;

        // Ciclo para contar o número de linhas
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            arrayLength++;
        }
        scanner.close();

        // Ler o ficheiro de novo
        scanner = new Scanner(new File(filePath));
        scanner.nextLine(); // Linha do cabeçalho

        String[][] sales = new String[arrayLength][];
        int index = 0;

        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            sales[index] = currentLine.split(";");
            index++;
        }

        scanner.close();
        return sales;
    }

    public static void printFiles(String[][] file) throws FileNotFoundException {

        for (int i = 0; i < file.length; i++) {
            for (int j = 0; j < file[i].length; j++) {
                System.out.print(file[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void totalSales(String[][] file) throws FileNotFoundException {

        int count = 0;
        double total = 0;

        for (int i = 0; i < file.length; i++) {
            for (int j = 0; j < file[i].length; j++) {
                total += Double.parseDouble(file[i][5]);
                count++;
                break;
            }
        }

        System.out.println("Quantidade de Vendas: " + count + " | Valor Total: " + total);

    }

    public static double totalProfit(String[][] file) throws FileNotFoundException {

        double totalProfit = 0;

        String[][] categories = readMatrix("src/Ficheiros/GameStart_Categorias.csv");

        for (int i = 0; i < file.length; i++) {
            String salesCategory = file[i][3];
            double salesPrice = Double.parseDouble(file[i][5]);

            for (int j = 0; j < file[i].length; j++) {

                String profitCategory = categories[i][0];
                double profitMargin = Double.parseDouble(categories[i][1]);

                if (salesCategory.equals(profitCategory)) {
                    totalProfit += salesPrice * profitMargin;
                    break;
                }
            }
        }
        return totalProfit;
    }

    public static void searchClients(String[][] file, String idClient) throws FileNotFoundException {

        for (int i = 0; i < file.length; i++) {
            for (int j = 0; j < file[i].length; j++) {
                if (file[i][0].equals(idClient)) {
                    System.out.println("Cliente: " + file[i][1] + " | Contacto: " + file[i][2] + " | Email: " + file[i][3]);
                    break;
                }
            }
        }

    }

    public static void mostExpensiveGame(String[][] salesMatrix, String[][] clientsMatrix) throws FileNotFoundException {

        String mostExpensive = "";
        double price = 0;

        for (int i = 0; i < salesMatrix.length; i++) {
            for (int j = 0; j < salesMatrix[i].length; j++) {
                if (Double.parseDouble(salesMatrix[i][5]) > price) {
                    price = Double.parseDouble(salesMatrix[i][5]);
                    mostExpensive = salesMatrix[i][4];
                }
            }
        }

        System.out.println("\nO jogo mais caro é " + mostExpensive + "\n");

        for (int i = 0; i < salesMatrix.length; i++) {
            if (salesMatrix[i][4].equals(mostExpensive)) {
                for (int j = 0; j < clientsMatrix.length; j++) {
                    if (clientsMatrix[j][0].equals(salesMatrix[i][1])) {
                        System.out.println("ID de Ciente: " + clientsMatrix[j][0] + " | Nome: " + clientsMatrix[j][1]);
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

    public static void searchByGame(String[][] salesMatrix, String[][] clientsMatrix, String game) throws FileNotFoundException {

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


        // SAO A VOLTA DE 81 JOGOS
    }

    // PARA O TOP TALVEZ UTILIZAR O BUBLE SHORT PARA REORDENAR A ARRAY POR VALORES E DEPOIS IMPRIMIR
}
