import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Admin {

    public static String[][] matriz(String filePath) throws FileNotFoundException {

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

        String[][] categories = matriz("src/Ficheiros/GameStart_Categorias.csv");

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
}
