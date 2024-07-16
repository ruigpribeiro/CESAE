package ex_04;

public class Main {
    public static void main(String[] args) {

        Imovel imovel = new Imovel("Rua de Fernão Magalhães", "Porto", 135, 3, 2, Acabamento.USADA, TipoApartamento.APARTAMENTO, 150, 15.74);
        System.out.println(imovel.valorImovel());

        Imovel imovel2 = new Imovel("Rua de Fernão Magalhães", "Porto", 205, 5, 5, Acabamento.NOVA, TipoApartamento.MANSAO, 200, 20);
        System.out.println(imovel2.valorImovel());


        Imovel compararImovel = imovel.compararImoveis(imovel2);
        compararImovel.imprimirDescricao();


    }
}
