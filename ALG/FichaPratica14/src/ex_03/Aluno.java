package ex_03;

public class Aluno extends Pessoa {
    private Curso curso;
    private double mediaNotas;
    private String[][] pauta;

    public Aluno(String nome, int anoNascimento, String email, String telemovel, Curso curso, double mediaNotas, String[][] pauta) {
        super(nome, anoNascimento, email, telemovel);
        this.curso = curso;
        this.mediaNotas = mediaNotas;
        this.pauta = pauta;
    }

    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }
}
