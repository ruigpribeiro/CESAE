package ex_05;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João Silva", 30, "joao@gmail.com", 912345678);
        Pessoa p2 = new Pessoa("Maria Santos", 25, "maria@gmail.com", 987654321);

        Agenda agenda = new Agenda();
        agenda.adicionarPessoas(p1);
        agenda.adicionarPessoas(p2);

        agenda.listarPessoas();
    }
}
