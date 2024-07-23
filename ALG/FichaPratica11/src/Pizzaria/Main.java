package Pizzaria;

import Pizzaria.enums.*;
import Pizzaria.ingredientes.base.Base;
import Pizzaria.ingredientes.topping.Carne;
import Pizzaria.ingredientes.topping.Queijo;

public class Main {
    public static void main(String[] args) {

        // Instanciação de uma pizza
        Pizza pizzaChourico = new Pizza("1", "Pizza de Chouriço", "Pizza tradicional com ingredientes " +
                "nacionais", 19.90, TamanhoPizza.GRANDE);
        Pizza pizza4Estacoes = new Pizza("2", "Pizza 4 Estações", "Pizza tradicional com sabores nacionais",
                15.90, TamanhoPizza.MEDIA);

        // Adicionar os ingredientes a uma pizza de carne
        pizzaChourico.adicionarIngredientes(new Base("1", "Massa Tracional", UnidadeMedida.GRAMAS, 450,
                BasePizza.MASSA_FINA, "FDSFSD"), 1);
        pizzaChourico.adicionarIngredientes(new Carne("4", "Chouriço Picante", UnidadeMedida.UNIDADES, 10,
                OrigemIngrediente.NACIONAL, TipoCarne.CHOURICO), 15);

        // Adicionar os ingredientes a uma pizza de queijo
        pizza4Estacoes.adicionarIngredientes(new Base("1", "Massa Tracional", UnidadeMedida.GRAMAS, 450,
                BasePizza.MASSA_FINA, "FDSFSD"), 1);
        pizza4Estacoes.adicionarIngredientes(new Queijo("2", "Queijo Mozzarela", UnidadeMedida.GRAMAS, 105,
                OrigemIngrediente.NACIONAL, TipoQueijo.MOZZARELA), 3);

        // Imprimir a descrição detalhada da pizza
        pizzaChourico.descricaoDetalhada();
        pizza4Estacoes.descricaoDetalhada();

        // Imprimir tipos de Pizza
        pizzaChourico.tipoPizza();
        pizza4Estacoes.tipoPizza();
    }
}
