package AirplaneStore;

import java.util.ArrayList;
import java.util.List;

public class AviaoCombate extends Aviao {
    private String paisOrigem;
    private boolean camuflagem;
    private List<String> armas;

    public AviaoCombate(int numeroSerie, String modelo, int anoFabrico, double pesoKg, double comprimentoFuselagem, double envergaduraAsas, double alturaCauda, int numeroMotores, double autonomiaKm, double velocidadeKmh, double preco, String paisOrigem, boolean camuflagem) {
        super(numeroSerie, modelo, anoFabrico, pesoKg, comprimentoFuselagem, envergaduraAsas, alturaCauda, numeroMotores, autonomiaKm, velocidadeKmh, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.armas = new ArrayList<>();
    }

    public void adicionarArma(String arma) {
        if (armas.size() < 3) {
            armas.add(arma);
        } else {
            System.out.println("Não é possivel adicionar mais armas");
        }
    }

    public void removerArma(String arma) {
        armas.remove(arma);
    }

    public void imprimirArmas() {
        for (String arma : armas) {
            System.out.println(arma);
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("País de Origem: " + paisOrigem);
        System.out.println("Camuflagem: " + (camuflagem ? "Sim" : "Não"));
        System.out.println("Arsenal: " + armas);
    }
}
