package ex_01;

public class Main {
    public static void main(String[] args) {

        Carro bmw = new Carro("BMW", "X6M", 2019, 190, 1999, TipoCombustivel.DIESEL, 6.9);
        Carro mercedes = new Carro("MERCEDES", "GLC250 AMG", 2019, 190, 2000, TipoCombustivel.GASOLINA, 7.6);

        Carro vencedor = bmw.corrida(mercedes);

        if (vencedor == null) {
            System.out.println("Empate Técnico");
        } else {
            System.out.println(vencedor);
        }

    }
}