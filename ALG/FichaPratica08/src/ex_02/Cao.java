package ex_02;

public class Cao {
    private String nome;
    private String raca;
    private String latido = "Au au au";

    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void ladrar() {
        System.out.println(latido);
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }
}
