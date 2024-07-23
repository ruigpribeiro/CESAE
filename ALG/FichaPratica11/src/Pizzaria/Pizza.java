package Pizzaria;

import Pizzaria.enums.TamanhoPizza;
import Pizzaria.ingredientes.Ingrediente;
import Pizzaria.ingredientes.base.Base;
import Pizzaria.ingredientes.topping.Carne;
import Pizzaria.ingredientes.topping.Queijo;
import Pizzaria.ingredientes.topping.Topping;
import Pizzaria.ingredientes.topping.Vegetal;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final int MAX_INGREDIENTES = 5;
    private String codigo;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanhoPizza;
    private List<IngredientePizza> listaIngredientes;
    private Base basePizza;

    /**
     * Método Construtor que recebe um código, um nome, uma descrição, um preço e o tamanho
     *
     * @param codigo       Codigo da Pizza
     * @param nome         Nome da Pizza
     * @param descricao    Descrição breve da Pizza
     * @param preco        Valor da Pizza em €
     * @param tamanhoPizza Tamanho da Pizzza
     */
    public Pizza(String codigo, String nome, String descricao, double preco, TamanhoPizza tamanhoPizza) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanhoPizza = tamanhoPizza;
        listaIngredientes = new ArrayList<>();
    }

    /**
     * Adiciona novos ingredientes a uma pizza até um máximo de 5
     *
     * @param ingrediente Ingrediente a adicionar à pizza
     */
    public void adicionarIngredientes(Ingrediente ingrediente, int quantidade) {

        if (basePizza != null) {
            // Já tem base (base que é o array na posição 0 não é nula)
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
     * @param codigo         Código do ingrediente
     * @param novaQuantidade Nova quantidade a inserir
     */
    public void editarQuantidade(String codigo, int novaQuantidade) {
        for (IngredientePizza ingredientePizza : listaIngredientes) {
            if (ingredientePizza.getIngrediente().getCodigo().equals(codigo)) {
                ingredientePizza.setQuantidade(novaQuantidade);
                return;
            }
        }
        System.out.println("Ingrediente não encontrado.");
    }

    /**
     * Remove um ingrediente à pizza pelo seu código
     *
     * @param codigo Código do ingrediente a ser removido
     */
    public void removerIngrediente(String codigo) {
        for (IngredientePizza ingredientePizza : listaIngredientes) {
            String ingredienteCodigo = ingredientePizza.getIngrediente().getCodigo();

            if (ingredienteCodigo.equals(codigo)) {
                listaIngredientes.remove(ingredientePizza);
                return;
            }
        }
        System.out.println("O ingrediente não existe.");
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
    public void tipoPizza() {
        int countCarne = 0;
        int countVegetal = 0;
        int countQueijo = 0;

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
        }

        if (countCarne == listaIngredientes.size()-1) {
            System.out.println("Pizza de Carne");
        }

        if (countVegetal == listaIngredientes.size()-1) {
            System.out.println("Pizza de Vegetal");
        }

        if (countQueijo == listaIngredientes.size()-1) {
            System.out.println("Pizza de Queijo");
        }
    }

    /**
     * Descrição detalhada dos ingredientes da coleção de IngredientePizza
     */
    public void descricaoDetalhada() {
        System.out.println("***************** " + nome + " *****************");
        String descricaoDetalhada = "Descrição: " + descricao + "\nTamanho: " + tamanhoPizza +
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
        System.out.println(descricaoDetalhada);
    }
}
