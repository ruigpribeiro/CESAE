package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        try {

            String path = "src/FicheirosFichaPratica07/exercicio_04.csv";
            readCsvFile(path);

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        }
    }

    public static void readCsvFile(String path) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(path));

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }

    }

}
