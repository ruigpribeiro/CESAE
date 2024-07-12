import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
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

    // FUNCIONA
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

    // FUNCIONA
    public static void printPublisherCatalog(String[][] sales) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Editora a pesquisar: ");
        String publisher = scanner.nextLine();

        int count = 0;

        // Ciclo para contar tudo o que seja da mesma editora introduzida
        for (int i = 0; i < sales.length; i++) {
            if (sales[i][2].equals(publisher)) {
                count++;
            }
        }

        String[][] categoriesAndGames = new String[count][2];
        // Ciclo para preencher a matriz com a categoria e o jogo
        for (int i = 0; i < categoriesAndGames.length; i++) {
            if (sales[i][2].equals(publisher)) {
                categoriesAndGames[i][0] = sales[i][3];
                categoriesAndGames[i][1] = sales[i][4];
            }
        }


        // Ciclo para apresentar os jogos dividos por categoria, pertencentes à mesma editora introduzida
        for (int i = 0; i < categoriesAndGames.length; i++) {

            String category = categoriesAndGames[i][0];

            if (categoriesAndGames[i][0] != null) {
                System.out.println("\nCategoria: " + category);
            }

            for (int j = 0; j < categoriesAndGames.length; j++) {

                if (categoriesAndGames[j][0] != null && categoriesAndGames[j][0].equals(category)) {
                    System.out.println(categoriesAndGames[j][1]);
                    categoriesAndGames[j][0] = null; // Substitui a categoria por null para não repetir
                }
            }
        }
    }

    // FUNCIONA
    public static void printCategoryCatalog(String[][] sales, String[][] categories) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza a categoria: ");
        String category = scanner.nextLine();

        int count = 0;

        // Ciclo para contar tudo o que seja da mesma categoria introduzida
        for (int i = 0; i < sales.length; i++) {
            if (sales[i][3].equals(category)) {
                count++;
            }
        }

        String[][] publishersAndGames = new String[count][2];
        // Ciclo para preencher a matriz com a editora e o jogo
        for (int i = 0; i < publishersAndGames.length; i++) {
            if (sales[i][3].equals(category)) {
                publishersAndGames[i][0] = sales[i][2]; // Editora
                publishersAndGames[i][1] = sales[i][4]; // Jogo
            }
        }



        // Ciclo para apresentar os jogos dividos por editora, pertencentes à mesma categoria
        for (int i = 0; i < publishersAndGames.length; i++) {

            String publisher = publishersAndGames[i][0];

            if (publishersAndGames[i][0] != null) {
                System.out.println("\nEditora: " + publisher);
            }

            for (int j = 0; j < publishersAndGames.length; j++) {

                if (publishersAndGames[j][0] != null && publishersAndGames[j][0].equals(publisher)) {
                    System.out.println(publishersAndGames[j][1]);
                    publishersAndGames[j][0] = null; // Substitui a editora por null para não repetir
                }
            }
        }


    }

    // FUNCIONA
    public static void mostRecentGame(String[][] sales) {

        System.out.println(printCatalog(sales)[printCatalog(sales).length - 1]);
    }
}
