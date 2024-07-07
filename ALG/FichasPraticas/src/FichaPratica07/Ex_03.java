package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        try {
            String readPath = "src/FicheirosFichaPratica07/exercicio_03.txt";
            String writePath = "src/FicheirosFichaPratica07/exercicio_03_new.txt";

            readAndWriteFile(readPath, writePath);

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        }

    }

    public static void readAndWriteFile (String pathRead, String pathWrite) throws FileNotFoundException {

        Scanner sc = new Scanner (new File(pathRead));
        PrintWriter pw = new PrintWriter (new File (pathWrite));

        while (sc.hasNextLine()) {
            pw.println(sc.nextLine());
        }

        pw.close();
    }
}
