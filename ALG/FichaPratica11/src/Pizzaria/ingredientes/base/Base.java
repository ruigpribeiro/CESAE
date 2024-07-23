package Pizzaria.ingredientes.base;

import Pizzaria.enums.BasePizza;
import Pizzaria.enums.TipoIngrediente;
import Pizzaria.enums.UnidadeMedida;
import Pizzaria.ingredientes.Ingrediente;

public class Base extends Ingrediente {
    private BasePizza tipoBase;
    private String descricao;

    public Base(String codigo, String nome, UnidadeMedida unidadeMedida, double calorias, BasePizza tipoBase, String descricao) {
        super(codigo, nome, unidadeMedida, calorias);
        this.tipoBase = tipoBase;
        this.descricao = descricao;
    }
}
