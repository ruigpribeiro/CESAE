package ex_10;

public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void aumentarSalario(double percentagem) {
        salario += (salario * percentagem/100);
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);
    }
}
