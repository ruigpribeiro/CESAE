package ex_02;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int anoFabrico;
    protected int potencia;
    protected int cilindrada;
    protected Combustivel combustivel;
    protected double litros100Km;

    public Veiculo(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, Combustivel combustivel, double litros100Km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.litros100Km = litros100Km;
    }

    public void ligar() {
        if ((2024 - anoFabrico) > 30 && combustivel.equals("DIESEL")) {
            System.out.println("Deita um pouco de fumo... Custa a pegar..." +
                    "O carro está a ligado!");
            System.out.println("Vrum-vrum-vrum");
        } else if ((2024 - anoFabrico) > 30 && !combustivel.equals("DIESEL")) {
            System.out.println("Custa a pegar... O carro está ligado!");
            System.out.println("Vrum-vrum-vrum");
        }

        if ((2024 - anoFabrico) <= 30 && potencia >= 250) {
            System.out.println("O carro está ligado!");
            System.out.println("VRUUMMMMMM");
        } else if ((2024 - anoFabrico) < 30 && potencia < 250) {
            System.out.println("O carro está ligado!");
            System.out.println("Vruummmmmmm");
        }
    }

    public Veiculo corrida(Veiculo adversario) {
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
        if (anoFabrico < adversario.anoFabrico) {
            return adversario;
        } else if (anoFabrico > adversario.anoFabrico) {
            return this;
        }

        // Empate
        return null;
    }

    public double consumo(int distanciaKm) {
        return (distanciaKm / 100) * litros100Km;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabrico: " + anoFabrico);
        System.out.println("Potência: " + potencia);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Combústivel: " + combustivel);
        System.out.println("Consumo: " + litros100Km);
    }

}
