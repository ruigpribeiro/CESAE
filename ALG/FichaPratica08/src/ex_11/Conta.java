package ex_11;

public class Conta {
    private int numeroConta;
    private double saldo;
    private String titular;

    public void transferencia(double valor, Conta conta) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            conta.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void levantar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Conta: " + numeroConta + " Saldo da conta: " + saldo);
    }

    public int getNumeroConta(int conta) {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
