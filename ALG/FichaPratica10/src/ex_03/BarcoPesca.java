package ex_03;

import java.util.ArrayList;
import java.util.List;

public class BarcoPesca {
    private String nome;
    private String cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;
    private Marca marca;
    private List<Peixe> peixesPescados;
    private List<Marisco> mariscosPescados;

    /**
     * Método construtor
     * @param nome Nome
     * @param cor Cor
     * @param anoFabrico Ano de Fabrico
     * @param tripulacao Tripulação
     * @param capacidadeCarga Capacidade de Carga
     * @param marca Marca
     */
    public BarcoPesca(String nome, String cor, int anoFabrico, int tripulacao, double capacidadeCarga, Marca marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marca = marca;
        peixesPescados = new ArrayList<>();
        mariscosPescados = new ArrayList<>();
    }

    /**
     * Adiciona um peixe e atualiza a carga
     * @param peixe Peixe a adicionar, se possivel (se o barco tiver capacidade)
     */
    public void pescarPeixe(Peixe peixe) {
        if (capacidadeCarga >= peixe.getPeso()) {
            capacidadeCarga += peixe.getPeso();
            peixesPescados.add(peixe);
        }
    }

    /**
     * Adiciona um marisco e atualiza a carga
     * @param marisco Marisco a adicionar, se possivel (se o barco tiver capacidade)
     */
    public void pescarMarisco(Marisco marisco) {
        if (capacidadeCarga >= marisco.getPeso()) {
            capacidadeCarga += marisco.getPeso();
            mariscosPescados.add(marisco);
        }
    }

    /**
     * Remove um peixe e atualiza a carga
     * @param peixe Peixe a remover
     */
    public void largarPeixe(Peixe peixe) {
        /*
        if(peixesPescados.remove(peixe)){
            capacidadeCarga -= peixe.getPeso();
        }
        */
        if(peixesPescados.contains(peixe)){
            peixesPescados.remove(peixe);
            capacidadeCarga -= peixe.getPeso();
        }
    }

    /**
     * Remove um marisco e atualiza a carga
     * @param marisco
     */
    public void largarMarisco(Marisco marisco) {
        if(mariscosPescados.contains(marisco)){
            mariscosPescados.remove(marisco);
            capacidadeCarga -= marisco.getPeso();
        }
    }

    /**
     * Cálcula o valor total da pesca
     * @return O valor total
     */
    public double calcularTotal() {
        double total = 0;
        for (Peixe peixe : peixesPescados) {
            total += peixe.calcularPreco();
        }
        for (Marisco marisco : mariscosPescados) {
            total += marisco.calcularPreco();
        }
        return total;
    }

    /**
     * Método que calcular o salario da tripulação
     * @return Salário individual em €
     */
    public double salarioTripulacao() {
        double total = calcularTotal();
        return (total * 0.6) / tripulacao;
    }
}
