package Pizzaria.ingredientes.topping;

import Pizzaria.enums.OrigemIngrediente;
import Pizzaria.enums.TipoFrutoMar;
import Pizzaria.enums.TipoIngrediente;
import Pizzaria.enums.UnidadeMedida;

public class FrutoMar extends Topping {
    private TipoFrutoMar tipoFrutoMar;

    public FrutoMar(String codigo, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoFrutoMar tipoFrutoMar) {
        super(codigo, nome, unidadeMedida, calorias, origem);
        this.tipoFrutoMar = tipoFrutoMar;
    }
}
