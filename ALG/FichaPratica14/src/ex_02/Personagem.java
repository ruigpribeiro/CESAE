package ex_02;

public class Personagem extends Entidade {
    private int nivel;
    private Categoria categoria;
    private String arma;

    public Personagem(String nome, int vida, int forca, int nivel, Categoria categoria, String arma) {
        super(nome, vida, forca);
        this.nivel = nivel;
        this.categoria = categoria;
        this.arma = arma;
    }

    public void atacar(NPC inimigo) {
        int tempVida = vida;
        int tempForca = forca;

        System.out.println("*******************************************");
        System.out.println("Personagem: " + this.nome + " | Vida: " + this.vida + " | Força: " + this.forca);
        System.out.println("NPC: " + inimigo.nome + " | Vida: " + inimigo.vida + " | Força: " + inimigo.forca);
        System.out.println("*******************************************");

        while (this.vida > 0 && inimigo.vida > 0) {
            System.out.println("\nÉ a vez do Personagem atacar!");
            inimigo.vida -= this.forca;
            System.out.println("Vida do Personagem: " + this.vida + " | Vida do NPC: " + inimigo.vida);

            if (inimigo.vida <= 0) {
                System.out.println("\nParabéns " + this.categoria.toString().toLowerCase() + " " + this.nome + ", ganhou um combate contra " + inimigo.nome + " com o uso de " + this.arma + ".");
                nivel++;
                this.vida = (int) (tempVida * 1.1);
                this.forca = (int) (tempForca * 1.1);
                System.out.println(this.nome + " subiu para o nível " + this.nivel + " | Nova vida: " + this.vida + " | Nova força: " + this.forca + "\n");
                return;
            }

            System.out.println("\nÉ a vez do NPC atacar!");
            this.vida -= inimigo.forca;
            System.out.println("Vida do Personagem: " + this.vida + " | Vida do NPC: " + inimigo.vida);

            if (this.vida <= 0) {
                System.out.println("\nPerdeu...");
                System.exit(0);
            }
        }
    }
}
