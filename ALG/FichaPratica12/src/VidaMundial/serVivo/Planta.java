package VidaMundial.serVivo;

import VidaMundial.enums.Familia;

public class Planta extends SerVivo {
    private Familia familia;
    private int grauDefesa;

    public Planta(String nome, String especie, String pais, int idade, Familia familia, int grauDefesa) {
        super(nome, especie, pais, idade);
        this.familia = familia;
        this.grauDefesa = grauDefesa;
    }

    public Familia getFamilia() {
        return familia;
    }

    public int getGrauDefesa() {
        return grauDefesa;
    }
}
