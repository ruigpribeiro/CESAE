package AirplaneStore;

public class Main {
    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo();

        JatoParticular jato1 = new JatoParticular(001, "Gulfstream G650", 2015, 40000,
                30, 28, 8, 2, 12000, 1000,
                650000, 18, 10000, CategoriaJato.HEAVY_JET);
        jato1.adicionarInstalacao(Instalacao.WC);
        jato1.adicionarInstalacao(Instalacao.WIFI);

        AviaoCombate aviao1 = new AviaoCombate(002, "F-22 Raptor", 2010, 19000,
                20, 14, 5, 2, 3000, 2400,
                150000, "EUA", true);
        aviao1.adicionarArma(Arma.BOMBAS);
        aviao1.adicionarArma(Arma.MISSEIS);

        catalogo.comprar(jato1);
        catalogo.comprar(aviao1);

        System.out.println("Catálogo de aviões:");
        catalogo.listarCatalogo();

        System.out.println("Valor total do catálogo: " + catalogo.calcularTotal() + "€");

    }
}