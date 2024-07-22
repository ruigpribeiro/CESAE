package AirplaneStore;

import java.util.ArrayList;
import java.util.List;

public class JatoParticular extends Aviao {
    private int lotacao;
    private double capacidadeBagagem;
    private CategoriaJato categoria;
    private List<String> instalacoes;
    ;

    public JatoParticular(int numeroSerie, String modelo, int anoFabrico, double pesoKg, double comprimentoFuselagem, double envergaduraAsas, double alturaCauda, int numeroMotores, double autonomiaKm, double velocidadeKmh, double preco, int lotacao, double capacidadeBagagem, CategoriaJato categoria) {
        super(numeroSerie, modelo, anoFabrico, pesoKg, comprimentoFuselagem, envergaduraAsas, alturaCauda, numeroMotores, autonomiaKm, velocidadeKmh, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        instalacoes = new ArrayList<>();
    }

    public void adicionarInstalacao(String instalacao) {
        instalacoes.add(instalacao);
    }

    public void removerInstalacao(String instalacao) {
        instalacoes.remove(instalacao);
    }

    public void imprimirInstalacoes() {
        for (String instalacao : instalacoes) {
            System.out.println(instalacao);
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Lotação: " + lotacao);
        System.out.println("Capacidade da Bagagem: " + capacidadeBagagem);
        System.out.println("Categoria: " + categoria);
        System.out.println("Instalações: " + instalacoes);
    }
}
