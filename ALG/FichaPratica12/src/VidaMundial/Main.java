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

        // Adiciona animais
        ambiente.addSerVivo(new Animal("Onça", "Panthera onca", "Brasil", 5, true, 80.0, 60.0, Alimentacao.CARNIVORO, "Rugido"));
        ambiente.addSerVivo(new Animal("Capivara", "Hydrochoerus hydrochaeris", "Brasil", 2, true, 50.0, 30.0, Alimentacao.HERBIVORO, "Grunhido"));

        // Adiciona insetos
        ambiente.addSerVivo(new Inseto("Abelha", "Apis", "Brasil", 1, false));
        ambiente.addSerVivo(new Inseto("Formiga", "Atta", "Brasil", 1, false));

        // Executa a simulação por um número de dias
        ambiente.simulador(5);

    }
}