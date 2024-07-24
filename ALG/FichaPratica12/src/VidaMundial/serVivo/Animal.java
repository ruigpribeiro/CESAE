package VidaMundial.serVivo;

import VidaMundial.enums.Alimentacao;

public class Animal extends SerVivo {
    private boolean fome;
    private double peso;
    private double inteligencia;
    private Alimentacao dieta;
    private String barulho;

    public Animal(String nome, String especie, String pais, int idade, boolean fome, double peso, double inteligencia, Alimentacao dieta, String barulho) {
        super(nome, especie, pais, idade);
        this.fome = fome;
        this.peso = peso;
        this.inteligencia = inteligencia;
        this.dieta = dieta;
        this.barulho = barulho;
    }

    public boolean isFome() {
        return fome;
    }

    public double getPeso() {
        return peso;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public Alimentacao getDieta() {
        return dieta;
    }

    public String getBarulho() {
        return barulho;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }
}
