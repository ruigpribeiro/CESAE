package ex_06;

public class Main {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("Rui", "Futebol", 1.71, 76.5, "Portugal");
        Atleta atleta2 = new Atleta("Vitor", "Basquetebol", 1.8, 85.5, "Portugal");
        Atleta atleta3 = new Atleta("Guilherme", "Futebol", 1.79, 86.5, "Portugal");
        Atleta atleta4 = new Atleta("Pedro", "Futebol", 1.83, 75.5, "Portugal");
        Atleta atleta5 = new Atleta("David", "Futebol", 1.75, 65.5, "Portugal");
        Atleta atleta6 = new Atleta("Zé da Esquina", "Basquetebol", 1.76, 80.5, "Portugal");

        Competicao futebol = new Competicao("Futebol", "Portugal");
        Competicao basquetebol = new Competicao("Basquetebol", "Portugal");

        futebol.adicionarAtleta(atleta1);
        futebol.adicionarAtleta(atleta3);
        futebol.adicionarAtleta(atleta4);
        futebol.adicionarAtleta(atleta5);

        basquetebol.adicionarAtleta(atleta2);
        basquetebol.adicionarAtleta(atleta6);

        futebol.imprimirInformacoes();
        System.out.println("-------------------------------------------------------------------------");
        basquetebol.imprimirInformacoes();

    }
}
