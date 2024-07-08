package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        try {
            String path = "src/FicheirosFichaPratica07/exercicio_10.csv";
            //printAllStudents(readFile(path));
            //printStudent(readFile(path), 123456);
            //printStudentsByClass(readFile(path), "Software Developer");
            printOldestStudent(readFile(path));


        } catch (Exception e) {
            System.out.println("Ficheiro não encontrado");
        }


    }

    public static void showMenu(String path) {

    }

    public static String[][] readFile(String path) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(path));
        String line = sc.nextLine();

        int length = 0;

        // Verificar quantas linhas tem para poder criar uma matriz com o tamanho correto
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            length++;
        }
        sc.close();

        sc = new Scanner(new File(path));
        String currentLine = sc.nextLine();

        String[][] data = new String[length][];
        int i = 0;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            data[i] = currentLine.split(",");
            i++;
        }

        sc.close();
        return data;
    }

    public static void printAllStudents(String[][] data) {

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println(data[i][0]);
                break;
            }
        }
    }

    public static void printStudent(String[][] data, int number) {

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {

                int studentReg = Integer.parseInt(data[i][1]);

                if (studentReg == number) {
                    System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2] + "\t" + data[i][3]);
                    break;
                }
            }
        }

    }

    public static void printStudentsByClass(String[][] data, String studentClass) {

        int count = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {

                String studentClassReg = data[i][2];

                if (studentClassReg.equals(studentClass)) {
                    System.out.println("Nome: " + data[i][0] + "\t Matricula: " + data[i][1]);
                    count++;
                    break;
                }
            }
        }
        System.out.println("\nNúmero de alunos inscritos: " + count);

    }

    public static void printOldestStudent(String[][] data) {

        int oldestStudent = 0;
        String oldestName = "";

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {

                if (Integer.parseInt(data[i][4]) > oldestStudent) {
                    oldestStudent = Integer.parseInt(data[i][4]);
                    oldestName = data[i][0];
                }
            }
        }

        System.out.println(oldestName);
    }

}
