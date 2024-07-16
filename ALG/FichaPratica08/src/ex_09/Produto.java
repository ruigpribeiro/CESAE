package ex_09;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade = 0;

    public void comprar(int quantidade) {

    }

    public void vender(int quantidadePretendida) {
        if (quantidadePretendida > quantidade) {
            System.out.println("Não existe stock suficiente.");
        } else {
            quantidade -= quantidadePretendida;
        }
        System.out.println(quantidade);
    }
}
