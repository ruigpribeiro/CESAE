package ex_03;

public class Marisco {
    private String especie;
    private double peso;
    private double precoKg;

    /**
     * Método construtor para <b>Marisco</b>
     * @param especie Espécie de <i>Marisco</i>
     * @param peso Peso em Kg.
     * @param precoKg Preço por Kg em €
     */
    public Marisco(String especie, double peso, double precoKg) {
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

