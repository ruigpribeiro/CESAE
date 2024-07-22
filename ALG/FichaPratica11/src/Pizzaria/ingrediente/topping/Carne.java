package Pizzaria.ingrediente.topping;

import Pizzaria.enums.TipoCarne;
import Pizzaria.enums.UnidadeMedida;

public class Carne extends Topping {
    TipoCarne tipoCarne;

    public Carne(String codigo, String nome, UnidadeMedida unidadeMedida, double calorias) {
        super(codigo, nome, unidadeMedida, calorias);
    }
}
