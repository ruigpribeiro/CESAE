package ex_02;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Instanciação de veiculos
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 150, 1800, Combustivel.GASOLINA, 6.0, 5);
        Carro carro2 = new Carro("Honda", "Civic", 2019, 140, 1600, Combustivel.DIESEL, 5.5, 5);
        Mota mota = new Mota("Yamaha", "R1", 2021, 200, 1000, Combustivel.GASOLINA, 5.0);
        Camiao camiao = new Camiao("Volvo", "FH", 2018, 500, 13000, Combustivel.DIESEL, 30.0, 20000);

        // Corrida entre carros
        System.out.println("Corrida entre dois carros:");
        Veiculo vencedorCarro = carro1.corrida(carro2);
        System.out.println("******************************");
        System.out.println("*** Vencedor ***");
        vencedorCarro.exibirDetalhes();


        // Corrida entre mota e camião
        System.out.println("\nCorrida entre uma mota e um camião:");
        Veiculo vencedorMotaCamiao = camiao.corrida(mota);
        System.out.println("******************************");
        System.out.println("*** Vencedor ***");
        vencedorMotaCamiao.exibirDetalhes();


        // Viagem de 150Km para um carro
        double distanciaViagem = 150;
        double custoViagem = carro1.calcularCusto(distanciaViagem);
        System.out.println("\nCusto da viagem de " + distanciaViagem + "Km para o carro: €" + custoViagem);

        // Viagem válida e outra inválida para o camião
        System.out.println("\nViagem válida para o camião:");
        camiao.viagem(100, 15000);

        System.out.println("\nViagem inválida (excesso peso) para o camião:");
        camiao.viagem(100, 25000);

        // Mostrar imagem da mota
        System.out.println("\nImagem da mota:");
        mota.imagem();

    }
}
