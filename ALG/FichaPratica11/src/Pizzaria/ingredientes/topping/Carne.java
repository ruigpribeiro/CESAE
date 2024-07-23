package Pizzaria.ingredientes.topping;

import Pizzaria.enums.OrigemIngrediente;
import Pizzaria.enums.TipoCarne;
import Pizzaria.enums.TipoIngrediente;
import Pizzaria.enums.UnidadeMedida;

public class Carne extends Topping {
    private TipoCarne tipoCarne;


    public Carne(String codigo, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoCarne tipoCarne) {
        super(codigo, nome, unidadeMedida, calorias, origem);
        this.tipoCarne = tipoCarne;
    }
}
