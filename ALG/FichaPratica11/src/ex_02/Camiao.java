package ex_02;

public class Camiao extends Veiculo {
    private double capacidadeCarga;

    public Camiao(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, Combustivel combustivel, double litros100Km, double capacidadeCarga) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, combustivel, litros100Km);
        this.capacidadeCarga = capacidadeCarga;
    }

    public void viagem(double distancia, double carga) {
        if (carga > capacidadeCarga) {
            System.out.println("A viagem não pode ser realizado pois ultrapassa a capacidade de carga");
            return;
        }

        double consumo = ((litros100Km*distancia)/100) + carga/1000;
        System.out.println("A viagem irá custa: " + consumo*1.95);
    }
}
