import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class GameStart {
    public static void main(String[] args) {
        try {

            String[][] salesMatrix = readMatrix("Ficheiros/GameStart_Vendas.csv");
            String[][] clientsMatrix = readMatrix("Ficheiros/GameStart_Clientes.csv");
            String[][] categoriesMatrix = readMatrix("Ficheiros/GameStart_Categorias.csv");

            Menu.login(salesMatrix, clientsMatrix, categoriesMatrix);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

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
}