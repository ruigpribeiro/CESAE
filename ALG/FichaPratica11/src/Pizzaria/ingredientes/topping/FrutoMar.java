package Pizzaria.ingredientes.topping;

import Pizzaria.enums.OrigemIngrediente;
import Pizzaria.enums.TipoFrutoMar;
import Pizzaria.enums.UnidadeMedida;

public class FrutoMar extends Topping {
    private TipoFrutoMar tipoFrutoMar;

    public FrutoMar(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoFrutoMar tipoFrutoMar) {
        super(id, nome, unidadeMedida, calorias, origem);
        this.tipoFrutoMar = tipoFrutoMar;
    }

    public TipoFrutoMar getTipoFrutoMar() {
        return tipoFrutoMar;
    }
}
