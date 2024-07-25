package ex_03;

import ex_03.enums.AreaFormacao;

import java.util.List;

public class Professor extends Pessoa {
    private List<AreaFormacao> areaFormacao;
    private int nivelAcademico;

    public Professor(String nome, int anoNascimento, String email, String telemovel, List<AreaFormacao> areaFormacao, int nivelAcademico) {
        super(nome, anoNascimento, email, telemovel);
        this.areaFormacao = areaFormacao;
        this.nivelAcademico = nivelAcademico;
    }

    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }
}
