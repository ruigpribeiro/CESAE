package Pizzaria.ingredientes;

import Pizzaria.enums.UnidadeMedida;

public class Ingrediente {
    private int id;
    private String nome;
    private UnidadeMedida unidadeMedida;
    private double calorias;

    public Ingrediente(int id, String nome, UnidadeMedida unidadeMedida, double calorias) {
        this.id = id;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.calorias = calorias;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public double getCalorias() {
        return calorias;
    }
}
