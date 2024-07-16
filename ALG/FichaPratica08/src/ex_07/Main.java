package ex_07;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("Harry Potter", "Rui", "Fantasia", 125, "157FDFD454");
        Livro livro2 = new Livro("Lord of the Rings", "Rui", "Fantasia", 125, "157FDfdsfFD454");

        livro.exibirDetalhes();
        System.out.println("*************************************");
        livro2.exibirDetalhes();
    }
}
