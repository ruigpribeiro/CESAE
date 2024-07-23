package Pizzaria.ingredientes.topping;

import Pizzaria.enums.OrigemIngrediente;
import Pizzaria.enums.UnidadeMedida;
import Pizzaria.ingredientes.Ingrediente;

public class Topping extends Ingrediente {
    private OrigemIngrediente origem;

    public Topping(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem) {
        super(id, nome, unidadeMedida, calorias);
        this.origem = origem;
    }

    public OrigemIngrediente getOrigem() {
        return origem;
    }
}
