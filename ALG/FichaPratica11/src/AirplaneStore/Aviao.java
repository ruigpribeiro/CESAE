package AirplaneStore;

public class Aviao {
    int numeroSerie;
    String modelo;
    int anoFabrico;
    double pesoKg;
    double comprimentoFuselagem;
    double envergaduraAsas;
    double alturaCauda;
    int numeroMotores;
    double autonomiaKm;
    double velocidadeKmh;
    double preco;


    public Aviao(int numeroSerie, String modelo, int anoFabrico, double pesoKg, double comprimentoFuselagem, double envergaduraAsas, double alturaCauda, int numeroMotores, double autonomiaKm, double velocidadeKmh, double preco) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.pesoKg = pesoKg;
        this.comprimentoFuselagem = comprimentoFuselagem;
        this.envergaduraAsas = envergaduraAsas;
        this.alturaCauda = alturaCauda;
        this.numeroMotores = numeroMotores;
        this.autonomiaKm = autonomiaKm;
        this.velocidadeKmh = velocidadeKmh;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Número de Serie: " + numeroSerie);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano Fabrico: " + anoFabrico);
        System.out.println("Peso (Kg): " + pesoKg);
        System.out.println("Comprimento Fuselagem: " + comprimentoFuselagem);
        System.out.println("Envergadura das Asas: " + envergaduraAsas);
        System.out.println("Altura da Cauda: " + alturaCauda);
        System.out.println("Número de Motores: " + numeroMotores);
        System.out.println("Autonomia (Km): " + autonomiaKm);
        System.out.println("Velocidade (Km/h): " + velocidadeKmh);
        System.out.println("Preço: " + preco);
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabrico() {
        return anoFabrico;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public double getComprimentoFuselagem() {
        return comprimentoFuselagem;
    }

    public double getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public double getAlturaCauda() {
        return alturaCauda;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public double getAutonomiaKm() {
        return autonomiaKm;
    }

    public double getVelocidadeKmh() {
        return velocidadeKmh;
    }

    public double getPreco() {
        return preco;
    }
}
