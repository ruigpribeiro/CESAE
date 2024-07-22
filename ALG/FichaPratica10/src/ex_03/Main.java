package ex_03;

public class Main {
    public static void main(String[] args) {

        BarcoPesca barco = new BarcoPesca("Pescador1", "Vermelho", 2010, 5, 1000, Marca.QUICKSILVER);

        Peixe peixe1 = new Peixe("Sardinha", 10, 2);
        Peixe peixe2 = new Peixe("Atum", 20, 5);

        Marisco marisco1 = new Marisco("Camarão", 5, 15);
        Marisco marisco2 = new Marisco("Polvo", 7, 12);

        barco.pescarPeixe(peixe1);
        barco.pescarPeixe(peixe2);
        barco.pescarMarisco(marisco1);
        barco.pescarMarisco(marisco2);

        System.out.println("Total pescado: " + barco.calcularTotal() + "€");
        System.out.println("Salário por tripulante: " + barco.salarioTripulacao() + "€");

        barco.largarPeixe(peixe1);
        barco.largarMarisco(marisco2);

        System.out.println("Total pescado após largar: " + barco.calcularTotal() + "€");
        System.out.println("Salário por tripulante após largar: " + barco.salarioTripulacao() + "€");
    }
}

