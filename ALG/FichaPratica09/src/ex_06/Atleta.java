package ex_06;

public class Atleta {
    private String nome;
    private String modalidade;
    private double altura;
    private double peso;
    private String pais;

    // Construtor
    public Atleta(String nome, String modalidade, double altura, double peso, String pais) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", modalidade='" + modalidade + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", pais='" + pais + '\'' +
                '}';
    }
}
