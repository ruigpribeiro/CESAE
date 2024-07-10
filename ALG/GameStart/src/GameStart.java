import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class GameStart {
    public static void main(String[] args) {

        try {
            Menu.login();
        } catch (Exception e) {
            System.out.println("Ficheiro não encontrado");
        }
    }
}