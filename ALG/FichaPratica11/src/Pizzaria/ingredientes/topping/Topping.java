package Pizzaria.ingredientes.topping;

import Pizzaria.enums.OrigemIngrediente;
import Pizzaria.enums.TipoIngrediente;
import Pizzaria.enums.UnidadeMedida;
import Pizzaria.ingredientes.Ingrediente;

public class Topping extends Ingrediente {
    private OrigemIngrediente origem;

    public Topping(String codigo, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem) {
        super(codigo, nome, unidadeMedida, calorias);
        this.origem = origem;
    }

    public OrigemIngrediente getOrigem() {
        return origem;
    }
}
