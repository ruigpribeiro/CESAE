package ex_03;

public class Peixe {
    private String especie;
    private double peso;
    private double precoKg;

    /**
     * Método construtor para Peixe
     * @param especie Espécie do peixe
     * @param peso Peso em Kg.
     * @param precoKg Preço por Kg. em €
     */
    public Peixe(String especie, double peso, double precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
    }

    /**
     * Calcula o preço do marisco com base no peso e preço por Kg.
     * @return Preço em €
     */
    public double calcularPreco() {
        return peso * precoKg;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecoKg() {
        return precoKg;
    }
}
