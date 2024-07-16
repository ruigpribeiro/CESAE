package ex_04;

public class Imovel {
    private String rua, cidade;
    private int numeroPorta, numeroQuartos, numeroBanhos;
    private Acabamento acabamento;
    private TipoApartamento tipoApartamento;
    private double area, areaPiscina;

    public Imovel(String rua, String cidade, int numeroPorta, int numeroQuartos, int numeroBanhos, Acabamento acabamento, TipoApartamento tipoApartamento, double area, double areaPiscina) {
        this.rua = rua;
        this.cidade = cidade;
        this.numeroPorta = numeroPorta;
        this.numeroQuartos = numeroQuartos;
        this.numeroBanhos = numeroBanhos;
        this.acabamento = acabamento;
        this.tipoApartamento = tipoApartamento;
        this.area = area;
        this.areaPiscina = areaPiscina;
    }

    public Imovel compararImoveis(Imovel imovel2) {
        double segundoImovel = imovel2.valorImovel();
        double primeiroImovel = this.valorImovel();

        if (segundoImovel > primeiroImovel) {
            return imovel2;
        } else {
            return this;
        }
    }

    public void imprimirDescricao() {
        System.out.println("Rua: " + rua);
        System.out.println("Cidade: " + cidade);
        System.out.println("Numero Porta: " + numeroPorta);
        System.out.println("Numero Quartos: " + numeroQuartos);
        System.out.println("Numero Banhos: " + numeroBanhos);
        System.out.println("Acabamento: " + acabamento);
        System.out.println("Tipo Apartamento: " + tipoApartamento);
        System.out.println("Area: " + area);
        System.out.println("AreaPiscina: " + areaPiscina);
    }

    public void mudarEstado(Acabamento estado) {
        acabamento = estado;
    }

    public double valorImovel() {
        double valorTotal = 0;
        double valorPorMetroQuadrado = 0;

        switch (tipoApartamento) {
            case TipoApartamento.APARTAMENTO:
                valorPorMetroQuadrado = 1000;
                break;
            case TipoApartamento.CASA:
                valorPorMetroQuadrado = 3000;
                break;
            case TipoApartamento.MANSAO:
                valorPorMetroQuadrado = 5000;
                break;
            default:
                System.out.println("Tipo de imóvel inválido!");
                return 0;
        }

        switch (acabamento) {
            case Acabamento.RESTAURO:
                valorTotal = valorPorMetroQuadrado * area * 0.5;
                break;
            case Acabamento.USADA:
                valorTotal = valorPorMetroQuadrado * area * 0.9;
                break;
            case Acabamento.NOVA:
                valorTotal = valorPorMetroQuadrado * area;
                break;
            case Acabamento.NOVA_COM_ALTO_ACABAMENTO:
                valorTotal = valorPorMetroQuadrado * area * 1.25;
                break;
            default:
                System.out.println("Tipo de acabamento inválido!");
                return 0;
        }

        valorTotal += numeroQuartos * 7500;
        valorTotal += numeroBanhos * 10500;

        valorTotal += areaPiscina * 1000;

        return valorTotal;
    }


}
