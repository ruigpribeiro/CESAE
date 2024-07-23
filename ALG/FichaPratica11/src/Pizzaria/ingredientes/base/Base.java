package Pizzaria.ingredientes.base;

import Pizzaria.enums.BasePizza;
import Pizzaria.enums.UnidadeMedida;
import Pizzaria.ingredientes.Ingrediente;

public class Base extends Ingrediente {
    private BasePizza tipoBase;
    private String descricao;

    public Base(int id, String nome, double calorias, BasePizza tipoBase, String descricao) {
        super(id, nome, UnidadeMedida.GRAMAS, calorias);
        this.tipoBase = tipoBase;
        this.descricao = descricao;
    }

    public BasePizza getTipoBase() {
        return tipoBase;
    }

    public String getDescricao() {
        return descricao;
    }
}
