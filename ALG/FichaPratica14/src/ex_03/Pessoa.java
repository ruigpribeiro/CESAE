package ex_03;

public abstract class Pessoa {
    protected String nome;
    protected int anoNascimento;
    protected String email;
    protected String telemovel;

    public Pessoa(String nome, int anoNascimento, String email, String telemovel) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.email = email;
        this.telemovel = telemovel;
    }

    public abstract void obterFuncao();

    public abstract void imprimirHorario();

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Email: " + email);
        System.out.println("Telemóvel: " + telemovel);
    }
}
