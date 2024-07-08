package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        try {

            String path = "src/FicheirosFichaPratica07/exercicio_06.txt";
            oldestPerson(path);

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        }


    }

    public static void oldestPerson (String path) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(path));

        int oldestAge = 0;
        String oldestName = "";

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] itemsPerLine = line.split(",");

            if (Integer.parseInt(itemsPerLine[1]) > oldestAge) {
                oldestAge = Integer.parseInt(itemsPerLine[1]);
                oldestName = itemsPerLine[0];
            }
        }

        System.out.println(oldestName);
        sc.close();
    }

}
