package Pizzaria;

import Pizzaria.enums.TamanhoPizza;
import Pizzaria.enums.UnidadeMedida;
import Pizzaria.ingrediente.Ingrediente;

public class Main {
    public static void main(String[] args) {

        // Instanciação de uma pizza
        Pizza pizzaChourico = new Pizza("1", "Pizza de Chouriço", "Pizza tradicional com ingredientes " +
                "nacionais", 19.90, TamanhoPizza.GRANDE);

        // Instanciação de 5 ingredientes
        Ingrediente massa = new Ingrediente("1", "Massa Tracional", UnidadeMedida.GRAMAS, 200);
        Ingrediente queijo = new Ingrediente("2", "Queijo Mozzarela", UnidadeMedida.GRAMAS, 300);
        Ingrediente molhoTomate = new Ingrediente("3", "Molho de Tomate", UnidadeMedida.LITROS, 50);
        Ingrediente chourico = new Ingrediente("4", "Chouriço Picante", UnidadeMedida.UNIDADES, 150);
        Ingrediente manjericao = new Ingrediente("5", "Folha de Manjericão", UnidadeMedida.UNIDADES, 1);

        // Adicionar os ingredientes a uma pizza
        pizzaChourico.adicionarIngredientes(massa);
        pizzaChourico.adicionarIngredientes(queijo);
        pizzaChourico.adicionarIngredientes(molhoTomate);
        pizzaChourico.adicionarIngredientes(chourico);
        pizzaChourico.adicionarIngredientes(manjericao);

        // Imprimir a descrição detalhada da pizza
        pizzaChourico.pizzaDetalhada();

    }
}
