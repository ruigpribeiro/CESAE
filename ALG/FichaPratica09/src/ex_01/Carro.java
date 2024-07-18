package ex_01;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int potencia, cilindrada;
    private TipoCombustivel tipoCombustivel;
    private double litros100Km;

    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100Km) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.litros100Km = litros100Km;
    }

    public void ligar() {
        if ((2024 - ano) > 30 && tipoCombustivel.equals("DIESEL")) {
            System.out.println("Deita um pouco de fumo... Custa a pegar..." +
                    "O carro está a ligado!");
            System.out.println("Vrum-vrum-vrum");
        } else if ((2024 - ano) > 30 && !tipoCombustivel.equals("DIESEL")) {
            System.out.println("Custa a pegar... O carro está ligado!");
            System.out.println("Vrum-vrum-vrum");
        }

        if ((2024 - ano) < 30 && potencia >= 250) {
            System.out.println("O carro está ligado!");
            System.out.println("VRUUMMMMMM");
        } else if ((2024 - ano) < 30 && potencia < 250) {
            System.out.println("O carro está ligado!");
            System.out.println("Vruummmmmmm");
        }
    }

    public Carro corrida(Carro adversario) {
        if (potencia < adversario.getPotencia()) {
            return adversario;
        } else if (potencia > adversario.getPotencia()) {
            return this;
        }

        if (cilindrada < adversario.getCilindrada()) {
            return adversario;
        } else if (cilindrada > adversario.getCilindrada()) {
            return this;
        }

        if (ano < adversario.getAno()) {
            return adversario;
        } else if (ano > adversario.getAno()) {
            return this;
        }

        return null;
    }

    public double consumo(int distanciaKm) {
        return (distanciaKm / 100) * litros100Km;
    }


    // GETTERS AND SETTERS

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getLitros100Km() {
        return litros100Km;
    }

    public void setLitros100Km(int litros100Km) {
        this.litros100Km = litros100Km;
    }
}
