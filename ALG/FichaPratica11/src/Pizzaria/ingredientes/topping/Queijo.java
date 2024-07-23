package Pizzaria.ingredientes.topping;

import Pizzaria.enums.OrigemIngrediente;
import Pizzaria.enums.TipoQueijo;
import Pizzaria.enums.UnidadeMedida;

public class Queijo extends Topping {
    private TipoQueijo tipoQueijo;


    public Queijo(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoQueijo tipoQueijo) {
        super(id, nome, unidadeMedida, calorias, origem);
        this.tipoQueijo = tipoQueijo;
    }

    public TipoQueijo getTipoQueijo() {
        return tipoQueijo;
    }
}
