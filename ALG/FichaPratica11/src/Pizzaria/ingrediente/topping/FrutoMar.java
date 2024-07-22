package Pizzaria.ingrediente.topping;

import Pizzaria.enums.TipoFrutoMar;
import Pizzaria.enums.UnidadeMedida;

public class FrutoMar extends Topping {
    TipoFrutoMar tipoFrutoMar;

    public FrutoMar(String codigo, String nome, UnidadeMedida unidadeMedida, double calorias) {
        super(codigo, nome, unidadeMedida, calorias);
    }
}
