package ex_03;

public class Funcionario extends Pessoa {
    private String funcao;

    public Funcionario(String nome, int anoNascimento, String email, String telemovel, String funcao) {
        super(nome, anoNascimento, email, telemovel);
        this.funcao = funcao;
    }


    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }
}
