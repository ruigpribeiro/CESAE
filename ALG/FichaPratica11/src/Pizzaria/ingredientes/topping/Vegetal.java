package Pizzaria.ingredientes.topping;

import Pizzaria.enums.OrigemIngrediente;
import Pizzaria.enums.TipoVegetal;
import Pizzaria.enums.UnidadeMedida;

public class Vegetal extends Topping {
    private TipoVegetal tipoVegetal;


    public Vegetal(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoVegetal tipoVegetal) {
        super(id, nome, unidadeMedida, calorias, origem);
        this.tipoVegetal = tipoVegetal;
    }

    public TipoVegetal getTipoVegetal() {
        return tipoVegetal;
    }
}
