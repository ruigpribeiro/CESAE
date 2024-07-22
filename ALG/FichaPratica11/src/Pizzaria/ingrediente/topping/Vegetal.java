package Pizzaria.ingrediente.topping;

import Pizzaria.enums.TipoVegetal;
import Pizzaria.enums.UnidadeMedida;

public class Vegetal extends Topping {
    TipoVegetal tipoVegetal;

    public Vegetal(String codigo, String nome, UnidadeMedida unidadeMedida, double calorias) {
        super(codigo, nome, unidadeMedida, calorias);
    }
}
