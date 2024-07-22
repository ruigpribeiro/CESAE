package Pizzaria.ingrediente.base;

import Pizzaria.enums.BasePizza;
import Pizzaria.enums.UnidadeMedida;
import Pizzaria.ingrediente.Ingrediente;

public class Base extends Ingrediente {
    BasePizza tipoBase;
    String descricao;

    public Base(String codigo, String nome, UnidadeMedida unidadeMedida, double calorias) {
        super(codigo, nome, UnidadeMedida.GRAMAS, calorias);
    }
}
