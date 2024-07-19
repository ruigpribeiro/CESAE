package ex_02;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica("Menino 1", "Rock", "Tony", 180);
        Musica musica2 = new Musica("Menino 2", "Jazz", "Maria", 240);
        Musica musica3 = new Musica("Menino 3", "Classical", "John", 300);
        Musica musica4 = new Musica("Menino 4", "Pop", "Anna", 210);
        Musica musica5 = new Musica("Menino 5", "Hip Hop", "Mike", 220);
        Musica musica6 = new Musica("Menino 6", "Electronic", "Sara", 260);

        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.adicionarMusica(musica1);
        musicPlayer.adicionarMusica(musica2);
        musicPlayer.adicionarMusica(musica3);
        musicPlayer.adicionarMusica(musica4);
        musicPlayer.adicionarMusica(musica5);
        musicPlayer.adicionarMusica(musica6);

        musicPlayer.trocarMusica(0,5);
        musicPlayer.imprimirRelatorio();

    }
}
