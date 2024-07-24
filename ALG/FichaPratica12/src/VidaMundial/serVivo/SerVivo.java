package VidaMundial.serVivo;

public class SerVivo {
    private String nome;
    private String especie;
    private String pais;
    private int idade;

    public SerVivo(String nome, String especie, String pais, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.pais = pais;
        this.idade = idade;
    }

    /**
     * Imprime todas as informações do objeto
     */
    public void listarInformacoes() {
        System.out.println("Nome: " + nome + " | Especie: " + especie + " | Pais: " + pais + " | Idade: " + idade);
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getPais() {
        return pais;
    }

    public int getIdade() {
        return idade;
    }
}
