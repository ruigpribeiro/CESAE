package ex_02;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta(1,1000, "Rui");
        conta.setValorDivida(0);
        if (conta.pedirEmprestimo(500)) {
            System.out.println("Conseguiste o emprestimo");
        } else {
            System.out.println("Não conseguiste o emprestimo");
        }
        System.out.println(conta.getSaldo());
    }
}
