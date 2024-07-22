package Pizzaria.ingrediente.topping;

import Pizzaria.enums.OrigemIngrediente;
import Pizzaria.enums.UnidadeMedida;
import Pizzaria.ingrediente.Ingrediente;

public class Topping extends Ingrediente {
    private OrigemIngrediente origem;

    public Topping(String codigo, String nome, UnidadeMedida unidadeMedida, double calorias) {
        super(codigo, nome, unidadeMedida, calorias);
    }
}
