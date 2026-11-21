package questao01;

public class Main {
    public static void main(String[] args) {
        Livro livroPadrao = new Livro();
        Livro livroIntermediario = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livroCompleto = new Livro("O Hobbit", "J. R. R. Tolkien", 70.00);

        System.out.println(livroPadrao);
        System.out.println(livroIntermediario);
        System.out.println(livroCompleto);
    }
}
