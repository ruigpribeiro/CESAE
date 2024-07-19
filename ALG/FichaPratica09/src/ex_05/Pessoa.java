package ex_05;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private int telemovel;

    // Construtor
    public Pessoa(String nome, int idade, String email, int telemovel) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telemovel = telemovel;

}
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", telemovel=" + telemovel +
                '}';
    }
}
