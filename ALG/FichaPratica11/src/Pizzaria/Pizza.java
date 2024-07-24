package Pizzaria;

import Pizzaria.enums.TamanhoPizza;
import Pizzaria.ingredientes.Ingrediente;
import Pizzaria.ingredientes.IngredientePizza;
import Pizzaria.ingredientes.base.Base;
import Pizzaria.ingredientes.topping.*;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final int MAX_INGREDIENTES = 5;
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanho;
    private List<IngredientePizza> listaIngredientes;
    private Base basePizza;

    /**
     * Método Construtor que recebe um código, um nome, uma descrição, um preço e o tamanho
     *
     * @param id        Id da Pizza
     * @param nome      Nome da Pizza
     * @param descricao Descrição breve da Pizza
     * @param preco     Valor da Pizza em €
     * @param tamanho   Tamanho da Pizzza
     */
    public Pizza(int id, String nome, String descricao, double preco, TamanhoPizza tamanho) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        listaIngredientes = new ArrayList<>();
    }

    /**
     * Adiciona novos ingredientes a uma pizza até um máximo de 5
     *
     * @param ingrediente Ingrediente a adicionar à pizza
     */
    public void adicionarIngrediente(Ingrediente ingrediente, int quantidade) {

        if (basePizza != null) {
            // Já tem base
            if (listaIngredientes.size() < MAX_INGREDIENTES && ingrediente instanceof Topping) {
                listaIngredientes.add(new IngredientePizza(ingrediente, quantidade));
                return;
            }
            System.out.println("Não é possível adicionar mais ingredientes.");
        } else {
            // Não tem base na pizza
            if (ingrediente instanceof Base) {
                listaIngredientes.add(new IngredientePizza(ingrediente, quantidade));
                basePizza = (Base) ingrediente;
                return;
            }
        }
        System.out.println("Ainda não há base, não pode adicionar ingredientes.");

    }

    /**
     * Editar a quantidade de um ingrediente que pertence à pizza
     *
     * @param id         Id do ingrediente
     * @param quantidade Nova quantidade a inserir
     */
    public void editarQuantidade(int id, int quantidade) {
        for (IngredientePizza ingredientes : listaIngredientes) {
            if (ingredientes.getIngrediente().getId() == id) {
                ingredientes.setQuantidade(quantidade);
                return;
            }
        }
        System.out.println("Ingrediente não encontrado.");
    }

    /**
     * Remove um ingrediente à pizza pelo seu id
     *
     * @param id Id do ingrediente a ser removido
     */
    public void removerIngrediente(int id) {
        for (IngredientePizza ingredientes : listaIngredientes) {
            if (!(ingredientes.getIngrediente() instanceof Base)) {
                if (ingredientes.getIngrediente().getId() == id) {
                    listaIngredientes.remove(ingredientes);
                    System.out.println("Ingrediente removido com sucesso!");
                    return;
                }
            }
        }
        System.out.println("O ingrediente não pode ser removido ou não existe.");
    }

    /**
     * Determina o número de calorias de uma Pizza
     *
     * @return O valor total de calorias de uma Pizza
     */
    public double caloriasPizza() {
        double calorias = 0;
        for (IngredientePizza ingredientePizza : listaIngredientes) {
            Ingrediente ingrediente = ingredientePizza.getIngrediente();
            double quantidade = ingredientePizza.getQuantidade();
            calorias += ingrediente.getCalorias() * quantidade;
        }

        return calorias;
    }

    /**
     * Imprime o tipo de pizza com base nos ingredientes
     */
    public String tipoPizza() {
        int countCarne = 0;
        int countVegetal = 0;
        int countQueijo = 0;
        int countFrutoMar = 0;

        for (IngredientePizza ingredientePizza : listaIngredientes) {
            Ingrediente ingrediente = ingredientePizza.getIngrediente();

            if (ingrediente instanceof Carne) {
                countCarne++;
            }
            if (ingrediente instanceof Vegetal) {
                countVegetal++;
            }
            if (ingrediente instanceof Queijo) {
                countQueijo++;
            }
            if (ingrediente instanceof FrutoMar) {
                countFrutoMar++;
            }
        }

        if (countCarne == listaIngredientes.size() - 1) {
            return "Pizza de Carne";
        }
        if (countVegetal == listaIngredientes.size() - 1) {
            return "Pizza Vegetariana";
        }
        if (countQueijo == listaIngredientes.size() - 1) {
            return "Pizza de Queijo";
        }
        if (countFrutoMar == listaIngredientes.size() - 1) {
            return "Pizza do Mar";
        }
        if (countCarne > 0 && countVegetal > 0 && countQueijo > 0 && countFrutoMar > 0) {
            return "Pizza Completa";
        }

        return "Pizza Mista";
    }

    /**
     * Descrição detalhada dos ingredientes da coleção de IngredientePizza
     */
    public String descricaoDetalhada() {
        System.out.println("***************** " + nome + " *****************");
        String descricaoDetalhada = "Descrição: " + descricao + "\nTamanho: " + tamanho +
                String.format("\nPreço: %.2f", preco) + "€" + "\nIngredientes:\n";

        for (IngredientePizza ingredientes : listaIngredientes) {
            double quantidade = ingredientes.getQuantidade();
            Ingrediente ingrediente = ingredientes.getIngrediente();

            descricaoDetalhada += " - " + ingrediente.getNome() + ": " +
                    String.format("%.2f", quantidade) + " " +
                    ingrediente.getUnidadeMedida() + ", Calorias: " +
                    String.format("%.2f", ingrediente.getCalorias()) +
                    ", Quantidade: " + ingredientes.getQuantidade() + "\n";
        }
        descricaoDetalhada += String.format("\nCalorias totais: %.2f Kcal%n", caloriasPizza());
        return descricaoDetalhada;
    }
}
