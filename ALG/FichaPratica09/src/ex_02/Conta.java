package ex_02;

public class Conta {
    private int numeroConta;
    private double saldo;
    private String titular;
    private int anoAbertura = 2023;
    private double margemEmprestimo = 90;
    private double valorDivida;

    public Conta(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public boolean pedirEmprestimo(double valor) {
        if (valorDivida == 0 && valor <= (saldo * (margemEmprestimo / 100))) {
            saldo += valor;
            valorDivida = valor;
            return true;
        }
        return false;
    }

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


    public int getNumeroConta() {
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

    public int getAnoAbertura() {
        return anoAbertura;
    }

    public void setAnoAbertura(int anoAbertura) {
        this.anoAbertura = anoAbertura;
    }

    public double getMargemEmprestimo() {
        return margemEmprestimo;
    }

    public void setMargemEmprestimo(int margemEmprestimo) {
        this.margemEmprestimo = margemEmprestimo;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}
