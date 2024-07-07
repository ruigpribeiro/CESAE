package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        try {
            String path = "src/FicheirosFichaPratica07/exercicio_09.csv";
            showMenu(path);

        } catch (Exception e) {
            System.out.println("Ficheiro não encontrado");
        }

    }

    public static String[][] readFile(String path) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(path));
        int totalLines = 46, line = 0;

        String[][] songsList = new String[totalLines][];
        String currentLine = sc.nextLine();

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            songsList[line] = currentLine.split(",");
            line++;
        }

        return songsList;
    }

    public static void showMenu(String path) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        String[][] songsList = readFile(path);

        while (true) {
            System.out.println("\n\n************* Menu de Opções ************");
            System.out.println("1. Pesquisar música de um determinado género");
            System.out.println("2. Pesquisar música de um determinado artista");
            System.out.println("3. Pesquisar música com maior duração");
            System.out.println("4. Pesquisar música com duração acima de um valor especificado");
            System.out.println("5. Número de músicas no ficheiro");
            System.out.println("6. Sair");

            System.out.print("\nEscolha uma opção: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Introduza o género: ");
                    String genre = sc.nextLine();
                    genre = sc.nextLine();
                    searchByGenre(songsList, genre);
                    break;
                case 2:
                    System.out.print("Introduza o artista: ");
                    String artist = sc.nextLine();
                    artist = sc.nextLine();
                    searchByArtist(songsList, artist);
                    break;
                case 3:
                    findLongestDurantion(songsList);
                    break;
                case 4:
                    System.out.print("Introduza os minutos: ");
                    int min = sc.nextInt();
                    System.out.print("Introduza os segundos: ");
                    int sec = sc.nextInt();
                    searchByDuration(songsList, min, sec);
                    System.out.println();
                    break;
                case 5:
                    numberOfSongs(songsList);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public static void searchByGenre(String[][] songs, String genre) {

        for (int i = 0; i < songs.length; i++) {
            if (songs[i][2].equals(genre)) {
                System.out.println(songs[i][0] + " - " + songs[i][1]);
            }
        }
    }

    public static void searchByArtist(String[][] songs, String artist) {

        for (int i = 0; i < songs.length; i++) {
            if (songs[i][1].equals(artist)) {
                System.out.println(songs[i][0] + " - " + songs[i][1]);
            }
        }
    }

    public static void findLongestDurantion(String[][] songs) {

        int longestDurantion = 0, index = 0;

        for (int i = 0; i < songs.length; i++) {

            String[] durationList = songs[i][3].split(":");

            int minutes = Integer.parseInt(durationList[0]);
            int seconds = Integer.parseInt(durationList[1]);
            int totalSeconds = minutes * 60 + seconds;

            if (totalSeconds > longestDurantion) {
                longestDurantion = totalSeconds;
                index = i;
            }
        }

        System.out.println(songs[index][0] + " - " + songs[index][1]);
    }

    public static void searchByDuration(String[][] songs, int minutes, int seconds) {

         for (int i = 0; i < songs.length; i++) {
             for (int j = 0; j < songs[i].length; j++) {

                 String[] durationList = songs[i][3].split(":");

                 int min = Integer.parseInt(durationList[0]);
                 int sec = Integer.parseInt(durationList[1]);

                 if (min >= minutes && sec >= seconds ) {
                     System.out.println(songs[i][0] + " - " + songs[i][1]);
                     break;
                 }
             }
         }

    }

    public static void numberOfSongs(String[][] songs) {

        System.out.println("Número de músicas: " + songs.length);


    }
}
