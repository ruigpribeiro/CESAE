package Pizzaria.ingredientes.topping;

import Pizzaria.enums.OrigemIngrediente;
import Pizzaria.enums.TipoIngrediente;
import Pizzaria.enums.TipoVegetal;
import Pizzaria.enums.UnidadeMedida;

public class Vegetal extends Topping {
    private TipoVegetal tipoVegetal;


    public Vegetal(String codigo, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoVegetal tipoVegetal) {
        super(codigo, nome, unidadeMedida, calorias, origem);
        this.tipoVegetal = tipoVegetal;
    }
}
