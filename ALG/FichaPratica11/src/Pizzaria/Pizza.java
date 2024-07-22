package Pizzaria;

import Pizzaria.enums.TamanhoPizza;
import Pizzaria.ingrediente.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final int MAX_INGREDIENTES = 5;
    private String codigo;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanhoPizza;
    private List<Ingrediente> listaIngredientes;

    /**
     * Método Construtor que recebe um código, um nome, uma descrição, um preço e o tamanho
     * @param codigo Codigo da Pizza
     * @param nome Nome da Pizza
     * @param descricao Descrição breve da Pizza
     * @param preco Valor da Pizza em €
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
     * @param ingrediente Ingrediente a adicionar à pizza
     */
    public void adicionarIngredientes(Ingrediente ingrediente) {
        if (listaIngredientes.size() < MAX_INGREDIENTES) {
            listaIngredientes.add(ingrediente);
            return;
        }
        System.out.println("Não é possível adicionar mais ingredientes.");
    }

    /**
     * Remove um ingrediente à pizza pelo seu código
     * @param codigo Código do ingrediente a ser removido
     */
    public void removerIngrediente(String codigo) {
        if (listaIngredientes.contains(codigo)) {
            listaIngredientes.remove(codigo);
            return;
        }
        System.out.println("O ingrediente não existe.");
    }

    /**
     * Determina o número de calorias de uma Pizza
     * @return O valor total de calorias de uma Pizza
     */
    public double caloriasPizza() {
        double calorias = 0;

        for (Ingrediente ingredientes : listaIngredientes) {
            calorias += ingredientes.getCalorias();
        }

        return calorias;
    }

    public void pizzaDetalhada() {
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: " + preco);
        System.out.println("Tamanho: " + tamanhoPizza);
        System.out.print("Ingrediente 1: ");
        listaIngredientes.get(0).exibirDetalhes();
        System.out.print("Ingrediente 2: ");
        listaIngredientes.get(1).exibirDetalhes();
        System.out.print("Ingrediente 3: ");
        listaIngredientes.get(2).exibirDetalhes();
        System.out.print("Ingrediente 4: ");
        listaIngredientes.get(3).exibirDetalhes();
        System.out.print("Ingrediente 5: ");
        listaIngredientes.get(4).exibirDetalhes();

    }
}
