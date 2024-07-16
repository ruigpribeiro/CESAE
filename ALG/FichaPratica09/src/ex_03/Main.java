package ex_03;

public class Main {
    public static void main(String[] args) {

        String[] alimentacao = {"Carne", "Peixe", "Ração"};

        Animal trex = new Animal("T-rex", "Cão", "Portugal", 10, alimentacao);
        trex.comer("Ração", 500);
        System.out.println(trex.getPesoKg());
        System.out.println();
        trex.comer("Erva", 20000);
        System.out.println(trex.getPesoKg());

    }
}
