package FichaPratica06;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        String animal;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza um animal: ");
        animal = scanner.next();

        fazerBarulho(animal);
    }

    public static void fazerBarulho(String animal) {

        switch (animal){
            case "Cão":
                System.out.println("Au au au");
                break;
            case "Gato":
                System.out.println("Miau");
                break;
            case "Peixe":
                System.out.println("Glub Glub");
                break;
            case "Vaca":
                System.out.println("Muuuu");
                break;
            case "Porco":
                System.out.println("Oinc oinc");
                break;
            default:
                System.out.println("*** Animal não reconhecido***");
        }
    }
}
