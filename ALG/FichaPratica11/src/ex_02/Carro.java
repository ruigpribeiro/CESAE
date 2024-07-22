package ex_02;

public class Carro extends Veiculo {
    private int quantidadePassageiros;

    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, Combustivel combustivel, double litros100Km, int quantidadePassageiros) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, combustivel, litros100Km);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public double calcularCusto(double distancia) {
        double consumo = (litros100Km*distancia)/100;
        double custo = 0;

        switch (combustivel) {
            case GASOLINA:
                custo = consumo * 2.10;
                break;
            case DIESEL:
                custo = consumo * 1.95;
                break;
            case GPL:
                custo = consumo * 1.15;
                break;
            case ELETRICO:
                custo = consumo * 0.12;
                break;
        }
        return custo;
    }
}
