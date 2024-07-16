package ex_07;

public class Livro {
    private String titulo;
    private String autor;
    private String categoria;
    private int numeroPaginas;
    private String isbn;

    public Livro(String titulo, String autor, String categoria, int numeroPaginas, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numeroPaginas = numeroPaginas;
        this.isbn = isbn;
    }

    public void exibirDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoria: " + categoria);
        System.out.println("Nr de Paginas: " + numeroPaginas);
        System.out.println("ISBN: " + isbn);
    }

}
