package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_02 {
    public static void main(String[] args) {

        try {
            String path = "src/FicheirosFichaPratica07/exercicio_02.txt";
            String message = "Hello World";
            createFile(path, message);

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        }



    }

    public static void createFile(String path, String message) throws FileNotFoundException {

        PrintWriter printWriter = new PrintWriter(new File(path));

        printWriter.println(message);
        printWriter.close();
    }
}
