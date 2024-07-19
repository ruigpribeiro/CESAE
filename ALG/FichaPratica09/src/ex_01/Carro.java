package ex_01;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int potencia, cilindrada;
    private TipoCombustivel tipoCombustivel;
    private double litros100Km;

    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100Km) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.litros100Km = litros100Km;
    }

    public void ligar() {
        if ((2024 - ano) > 30 && tipoCombustivel.equals("DIESEL")) {
            System.out.println("Deita um pouco de fumo... Custa a pegar..." +
                    "O carro está a ligado!");
            System.out.println("Vrum-vrum-vrum");
        } else if ((2024 - ano) > 30 && !tipoCombustivel.equals("DIESEL")) {
            System.out.println("Custa a pegar... O carro está ligado!");
            System.out.println("Vrum-vrum-vrum");
        }

        if ((2024 - ano) <= 30 && potencia >= 250) {
            System.out.println("O carro está ligado!");
            System.out.println("VRUUMMMMMM");
        } else if ((2024 - ano) < 30 && potencia < 250) {
            System.out.println("O carro está ligado!");
            System.out.println("Vruummmmmmm");
        }
    }

    public Carro corrida(Carro adversario) {
        // potencia
        if (potencia < adversario.potencia) {
            return adversario;
        } else if (potencia > adversario.potencia) {
            return this;
        }

        // cilindrada
        if (cilindrada < adversario.cilindrada) {
            return adversario;
        } else if (cilindrada > adversario.cilindrada) {
            return this;
        }

        // ano
        if (ano < adversario.ano) {
            return adversario;
        } else if (ano > adversario.ano) {
            return this;
        }

        // Empate
        return null;
    }

    public double consumo(int distanciaKm) {
        return (distanciaKm / 100) * litros100Km;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", potencia=" + potencia +
                ", cilindrada=" + cilindrada +
                ", tipoCombustivel=" + tipoCombustivel +
                ", litros100Km=" + litros100Km +
                '}';
    }
}
