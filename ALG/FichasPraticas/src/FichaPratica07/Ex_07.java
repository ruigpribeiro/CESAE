package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        try {

            String path = "src/FicheirosFichaPratica07/exercicio_07.txt";
            printLinesAndNumbers(path);

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        }
    }

    public static void printLinesAndNumbers (String path) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(path));

        int numberOfLines = 0;
        int numberOfWords = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            numberOfLines++;

            String[] words = line.split(" ");
            numberOfWords += words.length;

        }

        System.out.print("Number of Lines: " + numberOfLines);
        System.out.print("\nNumber of Words: " + numberOfWords);
        sc.close();
    }

}
