package Pizzaria.ingrediente.topping;

import Pizzaria.enums.TipoQueijo;
import Pizzaria.enums.UnidadeMedida;

public class Queijo extends Topping {
    TipoQueijo tipoQueijo;

    public Queijo(String codigo, String nome, UnidadeMedida unidadeMedida, double calorias) {
        super(codigo, nome, unidadeMedida, calorias);
    }
}
