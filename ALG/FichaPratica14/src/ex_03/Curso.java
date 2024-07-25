package ex_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Curso {
    private String nome;
    private List<DisciplinaCurso> disciplinas;
    private boolean longaDuracao;

    public void criarCurso() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        nome = scanner.next();

        System.out.print("Número de Disciplinas: ");
        int numDisciplinas = scanner.nextInt();

        System.out.println("Quais as disciplinas que quer adicionar: ");
        

    }
}
