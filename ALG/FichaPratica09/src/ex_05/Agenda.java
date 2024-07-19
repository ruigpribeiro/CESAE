package ex_05;

public class Agenda {
    private Pessoa[] arrayPessoas = new Pessoa[20];

    // Adicionar pessoas
    public void adicionarPessoas(Pessoa pessoa) {
        for (int i = 0; i < arrayPessoas.length; i++) {
            if (arrayPessoas[i] == null) {
                arrayPessoas[i] = pessoa;
                return;
            }
        }
    }

    // Imprimir pessoas
    public void listarPessoas() {
        for (int i = 0; i < arrayPessoas.length; i++) {
            if (arrayPessoas[i] != null) {
                System.out.println(arrayPessoas[i]);
            }
        }
    }
}
