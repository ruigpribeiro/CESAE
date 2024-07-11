import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Client {

    // FUNCIONA
    public static void registClient() {

        Scanner scanner = new Scanner(System.in);
        String name, contact, email;

        System.out.print("Nome: ");
        name = scanner.nextLine();
        System.out.print("Contato: ");
        contact = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();

        System.out.println("\nCliente inserido com Sucesso!\nNome: " + name + "\nContato: " + contact + "\nEmail: " + email);

    }

    // FUNCIONA
    public static void searchCarParking() {

        for (int i = 1; i <= 121; i++) {
            if ((i * (i + 1) / 2) % 5 == 0) {
                System.out.println("Lugares Disponiveis: " + i);
            }
        }
    }

    // FUNCIONA
    public static String[] printCatalog(String[][] sales) {

        String[] gamesDuplicated = new String[sales.length];

        // Ciclo para criar um array com todos os jogos incluindo duplicados
        for (int i = 0; i < sales.length; i++) {
            gamesDuplicated[i] = sales[i][4];
        }

        String[] uniqueGames = new String[sales.length];
        int countUniques = 0;
        boolean isUnique;

        for (int i = 0; i < gamesDuplicated.length; i++) {
            isUnique = true;

            for (int j = 0; j < gamesDuplicated.length; j++) {

                if (gamesDuplicated[i].equals(gamesDuplicated[j]) && j != i) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueGames[countUniques] = gamesDuplicated[i];
                countUniques++;
            }
        }

        String[] finalUniqueArray = new String[countUniques];

        // Ciclo para limpar os null
        for (int i = 0; i < finalUniqueArray.length; i++) {
            finalUniqueArray[i] = uniqueGames[i];
        }

        return finalUniqueArray;
    }

    // FUNCIONA MAS FAZ EXIT DEPOIS DE APRESENTAR O TXT
    public static void printCatalogGraphics() throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nLista de Jogos:");
        System.out.println("1. Call of Duty");
        System.out.println("2. Fifa");
        System.out.println("3. Hollow Knight");
        System.out.println("4. Mortal Kombat");
        System.out.println("5. Overcooked");
        System.out.println("6. Witcher 3: Wild Hunt");
        System.out.println("7. Minecraft");
        System.out.print("\nIntroduza a opção: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                printCatalogTxt("Ficheiros/CatalogoGrafico/callOfDuty.txt");
                break;
            case 2:
                printCatalogTxt("Ficheiros/CatalogoGrafico/fifa.txt");
                break;
            case 3:
                printCatalogTxt("Ficheiros/CatalogoGrafico/hollowKnight.txt");
                break;
            case 4:
                printCatalogTxt("Ficheiros/CatalogoGrafico/mortalKombat.txt");
                break;
            case 5:
                printCatalogTxt("Ficheiros/CatalogoGrafico/overcooked.txt");
                break;
            case 6:
                printCatalogTxt("Ficheiros/CatalogoGrafico/witcher3.txt");
                break;
            case 7:
                printCatalogTxt("Ficheiros/CatalogoGrafico/minecraft.txt");
                break;
        }

    }

    public static void printCatalogTxt(String filepath) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(filepath));

        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            System.out.println(currentLine);
        }

    }

    // FUNCIONA MAS REPETE OS JOGOS TODOS E NÃO MOSTRA OS UNICOS
    public static void printPublisherCatalog(String[][] sales) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Editora a pesquisar: ");
        String publisher = scanner.nextLine();

        String[] games = new String[sales.length];
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i][2].equals(publisher)) {
                games[count] = sales[i][4];
                count++;
            }
        }

        String currentGame = "";

        for (int i = 0; i < count; i++) {

            if (games[i] != null && !games[i].equals(currentGame)) {
                System.out.println(games[i]);
                currentGame = games[i];
            }

        }
    }

    // FUNCIONA MAS REPETE TUDO
    public static void printCategoryCatalog(String[][] sales, String[][] categories) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza a categoria: ");
        String category = scanner.nextLine();

        for (int i = 0; i < sales.length; i++) {
            if (sales[i][3].equals(category)) {
                System.out.println("Editora: " + sales[i][2] + " | Jogo: " + sales[i][4]);
            }
        }
    }

    // FUNCIONA
    public static void mostRecentGame(String[][] sales) {

        System.out.println(printCatalog(sales)[printCatalog(sales).length - 1]);
    }
}
