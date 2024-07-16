package ex_03;

public class Animal {
    private String nome, especie, paisOrigem;
    private double pesoKg;
    private String[] alimentacao;

    public Animal(String nome, String especie, String paisOrigem, double pesoKg, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.pesoKg = pesoKg;
        this.alimentacao = alimentacao;
    }

    public void comer(String alimento, double peso) {
        for (int i = 0; i < alimentacao.length; i++) {
            if (alimentacao[i].equals(alimento)) {
                pesoKg += (peso/1000);
                System.out.println("O animal comeu");
                return;
            }
        }
        System.out.println("O animal recusou essa comida");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public String[] getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String[] alimentacao) {
        this.alimentacao = alimentacao;
    }
}
