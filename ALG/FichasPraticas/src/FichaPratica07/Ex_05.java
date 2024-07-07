package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        try {

            String path = "src/FicheirosFichaPratica07/exercicio_05_31.txt";
            System.out.println(totalSum(path));

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        }


    }

    public static int totalSum(String path) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(path));

        int totalSum = 0;

        while (sc.hasNextInt()) {
            int line = sc.nextInt();
            totalSum += line;
        }

        return totalSum;
    }
}
