package ex_03;

import ex_03.enums.AreaFormacao;

import java.util.Scanner;

public class Disciplina {
    private String nome;
    private AreaFormacao areaFormacao;
    private int duracaoHoras;

    public Disciplina(String nome, AreaFormacao areaFormacao, int duracaoHoras) {
        this.nome = new Scanner(System.in).next();
        this.areaFormacao = AreaFormacao.valueOf(new Scanner(System.in).next());
        this.duracaoHoras = new Scanner(System.in).nextInt();
    }

}
