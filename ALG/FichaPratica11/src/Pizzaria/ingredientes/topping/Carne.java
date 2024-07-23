package Pizzaria.ingredientes.topping;

import Pizzaria.enums.OrigemIngrediente;
import Pizzaria.enums.TipoCarne;
import Pizzaria.enums.UnidadeMedida;

public class Carne extends Topping {
    private TipoCarne tipoCarne;


    public Carne(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoCarne tipoCarne) {
        super(id, nome, unidadeMedida, calorias, origem);
        this.tipoCarne = tipoCarne;
    }

    public TipoCarne getTipoCarne() {
        return tipoCarne;
    }
}
