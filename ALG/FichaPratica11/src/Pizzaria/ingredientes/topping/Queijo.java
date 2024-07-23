package Pizzaria.ingredientes.topping;

import Pizzaria.enums.OrigemIngrediente;
import Pizzaria.enums.TipoIngrediente;
import Pizzaria.enums.TipoQueijo;
import Pizzaria.enums.UnidadeMedida;

public class Queijo extends Topping {
    private TipoQueijo tipoQueijo;


    public Queijo(String codigo, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoQueijo tipoQueijo) {
        super(codigo, nome, unidadeMedida, calorias, origem);
        this.tipoQueijo = tipoQueijo;
    }
}
