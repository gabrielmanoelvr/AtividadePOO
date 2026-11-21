package questao01;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro() {
        this("Sem titulo", "Desconhecido", 0.0);
    }

    public Livro(String titulo, String autor) {
       this.titulo = titulo;
        this.autor = autor;
        this.preco = 0.0;
    }

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{Titulo:'" + titulo + "', Autor:'" + autor + "', R$ " + preco + "}";
    }
}
