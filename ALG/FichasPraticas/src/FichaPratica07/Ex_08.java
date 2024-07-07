package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        try {
            String path = "src/FicheirosFichaPratica07/exercicio_08.csv";
            System.out.println(totalSales(path));

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        }

    }

    public static double totalSales (String path) throws FileNotFoundException {

        Scanner sc = new Scanner (new File(path));
        String currentLine = sc.nextLine();

        double total = 0;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();

            String[] data = currentLine.split(",");

            total += (Double.parseDouble(data[2]) * Double.parseDouble(data[3]));

        }

        return total;
    }

}
