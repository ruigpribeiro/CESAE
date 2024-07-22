package Pizzaria.ingrediente;

import Pizzaria.enums.UnidadeMedida;

public class Ingrediente {
    private String codigo;
    private String nome;
    private UnidadeMedida unidadeMedida;
    private double calorias;

    public Ingrediente(String codigo, String nome, UnidadeMedida unidadeMedida, double calorias) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.calorias = calorias;
    }

    public void exibirDetalhes() {
        System.out.println(codigo + " | " + nome + " | " + unidadeMedida + " | " + calorias);
    }

}
