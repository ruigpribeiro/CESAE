package ex_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculo {

    public Mota(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, Combustivel combustivel, double litros100Km) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, combustivel, litros100Km);
    }

    public void imagem() throws FileNotFoundException {
        String filePath = "resources/Mota.txt";
        Scanner scanner = new Scanner(new File(filePath));

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }

}
