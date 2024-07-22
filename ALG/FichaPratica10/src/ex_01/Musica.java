package ex_01;

public class Musica {
    private String titulo;
    private String genero;
    private String artista;
    private int segundos;

    public Musica(String titulo, String genero, String artista, int segundos) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.segundos = segundos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
}
