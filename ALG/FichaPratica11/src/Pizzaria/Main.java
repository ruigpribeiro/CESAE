package Pizzaria;

import Pizzaria.enums.*;
import Pizzaria.ingredientes.Ingrediente;
import Pizzaria.ingredientes.IngredientePizza;
import Pizzaria.ingredientes.base.Base;
import Pizzaria.ingredientes.topping.Carne;
import Pizzaria.ingredientes.topping.FrutoMar;
import Pizzaria.ingredientes.topping.Queijo;
import Pizzaria.ingredientes.topping.Vegetal;

public class Main {
    public static void main(String[] args) {

        // Instanciar os ingredientes
        Base massaFina = new Base(1, "Massa Fina", 200, BasePizza.MASSA_FINA, "Massa fina e crocante");
        Queijo mozarela = new Queijo(2, "Mozarela", UnidadeMedida.GRAMAS, 10, OrigemIngrediente.NACIONAL, TipoQueijo.MOZZARELA);
        Carne chourico = new Carne(3, "Chouriço", UnidadeMedida.GRAMAS, 20, OrigemIngrediente.NACIONAL, TipoCarne.CHOURICO);
        FrutoMar camarao = new FrutoMar(4, "Camarão", UnidadeMedida.GRAMAS, 15, OrigemIngrediente.IMPORTADO, TipoFrutoMar.CAMARAO);
        Vegetal tomate = new Vegetal(5, "Tomate", UnidadeMedida.GRAMAS, 5, OrigemIngrediente.NACIONAL, TipoVegetal.TOMATE);

        // Criar a pizza
        Pizza pizza = new Pizza(1, "Especial da Casa", "Uma deliciosa pizza com ingredientes selecionados", 12.99, TamanhoPizza.GRANDE);

        // Adicionar a base primeiro
        System.out.println("A adicionar base à pizza...");
        pizza.adicionarIngrediente(massaFina, 100);

        // Adicionar coberturas
        System.out.println("A adicionar ingredientes à pizza...");
        pizza.adicionarIngrediente(mozarela, 50);
        pizza.adicionarIngrediente(chourico, 30);
        pizza.adicionarIngrediente(camarao, 40);
        pizza.adicionarIngrediente(tomate, 60);

        // Imprimir os detalhes da pizza
        System.out.println("\nDescrição detalhada da pizza:");
        System.out.println(pizza.descricaoDetalhada());

        // Imprimir o tipo de pizza
        System.out.println("Tipo de Pizza: " + pizza.tipoPizza());

        // Remover topping da pizza
        System.out.println("\nA remover topping da pizza...");
        pizza.removerIngrediente(3);

        // Remover base da pizza
        System.out.println("\nA remover base da pizza...");
        pizza.removerIngrediente(1);
    }
}
