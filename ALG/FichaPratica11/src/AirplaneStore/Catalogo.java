package AirplaneStore;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Aviao> avioes;

    // Constructor
    public Catalogo() {
        this.avioes = new ArrayList<Aviao>();
    }

    public void comprar(Aviao aviao){
        avioes.add(aviao);
    }

    public void venderAviao(Aviao aviao){
        avioes.remove(aviao);
    }

    public double calcularTotal() {
        double total = 0;
        for (Aviao aviao : avioes) {
            total += aviao.getPreco();
        }
        return total;
    }

    public void listarCatalogo() {
        for (Aviao aviao : avioes) {
            aviao.exibirDetalhes();
        }
    }
}
