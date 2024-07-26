package VidaMundial;

import VidaMundial.enums.Alimentacao;
import VidaMundial.enums.Familia;
import VidaMundial.serVivo.Animal;
import VidaMundial.serVivo.Inseto;
import VidaMundial.serVivo.Planta;

public class Main {
    public static void main(String[] args) {

        // Cria o ambiente com um nome e quantidade inicial de água
        MeioAmbiente ambiente = new MeioAmbiente("Floresta Amazônica", 100.0);

        // Adiciona plantas
        ambiente.addSerVivo(new Planta("Orquídea", "Orchidaceae", "Brasil", 3, Familia.FLORES, 2));
        ambiente.addSerVivo(new Planta("Carvalho", "Fagaceae", "Brasil", 50, Familia.ARVORES, 3));
        ambiente.addSerVivo(new Planta("Bromélia", "Bromeliaceae", "Brasil", 2, Familia.FLORES, 1));
        ambiente.addSerVivo(new Planta("Ipê", "Handroanthus", "Brasil", 10, Familia.ARVORES, 4));
        ambiente.addSerVivo(new Planta("Palmeira", "Arecaceae", "Brasil", 15, Familia.ARVORES, 3));

        // Adiciona animais
        ambiente.addSerVivo(new Animal("Onça", "Panthera onca", "Brasil", 5, true, 80.0, 60.0, Alimentacao.CARNIVORO, "Rugido"));
        ambiente.addSerVivo(new Animal("Capivara", "Hydrochoerus hydrochaeris", "Brasil", 2, true, 50.0, 30.0, Alimentacao.HERBIVORO, "Grunhido"));
        ambiente.addSerVivo(new Animal("Tucano", "Ramphastos", "Brasil", 3, true, 20.0, 5.0, Alimentacao.OMNIVORO, "Canto"));
        ambiente.addSerVivo(new Animal("Tamanduá", "Myrmecophaga tridactyla", "Brasil", 6, false, 35.0, 60.0, Alimentacao.OMNIVORO, "Grunhido"));
        ambiente.addSerVivo(new Animal("Jaguatirica", "Leopardus pardalis", "Brasil", 4, true, 12.0, 40.0, Alimentacao.CARNIVORO, "Rugido"));

        // Adiciona insetos
        ambiente.addSerVivo(new Inseto("Abelha", "Apis", "Brasil", 1, false));
        ambiente.addSerVivo(new Inseto("Formiga", "Atta", "Brasil", 1, false));
        ambiente.addSerVivo(new Inseto("Borboleta", "Lepidoptera", "Brasil", 1, false));
        ambiente.addSerVivo(new Inseto("Besouro", "Coleoptera", "Brasil", 2, false));
        ambiente.addSerVivo(new Inseto("Mariposa", "Lepidoptera", "Brasil", 1, false));

        // Executa a simulação por um número de dias
        ambiente.simulador(5);

    }
}