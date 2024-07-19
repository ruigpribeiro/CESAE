package ex_02;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Musica> programacao;

    public MusicPlayer() {
        programacao = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        programacao.add(musica);
    }

    public void trocarMusica(Musica musica, int indexTroca) {
        programacao.set(indexTroca, musica);
    }

    public void trocarMusica(Musica musica, String artista) {
        for (int i = 0; i < programacao.size(); i++) {
            if (programacao.get(i).getArtista().equals(artista)) {
                programacao.set(i, musica);
            }
        }
    }

    public void trocarMusica(int index1, int index2) {
        Musica temp = programacao.get(index1);
        programacao.set(index1, programacao.get(index2));
        programacao.set(index2, temp);
    }

    public void removerMusica(Musica musica) {
        programacao.remove(musica);
    }

    public void removerTodas() {
        programacao.clear();
    }

    public void imprimirRelatorio() {
        for (int i = 0; i < programacao.size(); i++) {
            System.out.println("Música " + (i + 1) + ": " + programacao.get(i).getTitulo() + " | " + programacao.get(i).getGenero() + " | " + programacao.get(i).getArtista() + " | " + programacao.get(i).getSegundos());
        }
    }

    public void duracao() {
        int totalSegundos = 0;
        for (int i = 0; i < programacao.size(); i++) {
            totalSegundos += programacao.get(i).getSegundos();
        }

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.println("Duração: " + horas + ":" + minutos + ":" + segundos);
    }
}
