package ex_02;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Rui", 26, 91845265, "ruiguilhermeribeiro@gmail.com");
        Pessoa pessoa2 = new Pessoa("Vitor", 20, 91863225, "ruiguilhermeribeiro@gmail.com");
        Pessoa pessoa3 = new Pessoa("Pedro", 24, 59578456, "ruiguilhermeribeiro@gmail.com");
        Pessoa pessoa4 = new Pessoa("David", 30, 42852612, "ruiguilhermeribeiro@gmail.com");
        Pessoa pessoa5 = new Pessoa("Zé da Esquina", 19, 42000042, "ruiguilhermeribeiro@gmail.com");

        Sorteio sorteio = new Sorteio();
        sorteio.adicionarParticipante(pessoa1);
        sorteio.adicionarParticipante(pessoa2);
        sorteio.adicionarParticipante(pessoa3);
        sorteio.adicionarParticipante(pessoa4);
        sorteio.adicionarParticipante(pessoa5);

        sorteio.imprimirListaParticipantes();
    }
}