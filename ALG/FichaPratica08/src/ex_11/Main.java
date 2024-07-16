package ex_11;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setNumeroConta(1);
        conta.depositar(1000);
        //conta.mostrarSaldo();

        //conta.levantar(120);
        //conta.mostrarSaldo();

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.setTitular("Vitor");
        conta1.setNumeroConta(2);
        conta1.setSaldo(1000);

        conta2.setTitular("David");
        conta2.setNumeroConta(3);
        conta2.setSaldo(500);

        conta.transferencia(400, conta2);

        conta.mostrarSaldo();
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
    }
}
