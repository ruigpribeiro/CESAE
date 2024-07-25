package ex_02;

public class Jogo {
    public static void main(String[] args) {

        // Cria um personagem
        Personagem jogador = new Personagem("Rui", 100, 20, 1, Categoria.CAVALEIRO, "Espada");

        // Cria três inimigos NPC
        NPC inimigo1 = new NPC("Goblin", 50, 10);
        NPC inimigo2 = new NPC("Troll", 80, 15);
        NPC inimigo3 = new NPC("Dragão", 120, 25);

        // Inicia os combates
        jogador.atacar(inimigo1);
        jogador.atacar(inimigo2);
        jogador.atacar(inimigo3);

    }
}
