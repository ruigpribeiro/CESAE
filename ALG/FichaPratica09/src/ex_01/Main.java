package ex_01;

public class Main {
    public static void main(String[] args) {

        Carro bmw = new Carro("BMW", "X6M", 2019, 190, 1998, TipoCombustivel.DIESEL, 6.9);
        Carro mercedes = new Carro("MERCEDES", "GLC250 AMG", 2017, 245, 2143, TipoCombustivel.GASOLINA, 7.6);

        Carro vencedor = bmw.corrida(mercedes);
        if (vencedor == null) {
            System.out.println("Empate");
        } else if (vencedor == bmw) {
            System.out.println("BMW é o vencedor");
        } else {
            System.out.println("MERCEDES é o vencedor");
        }

    }
}