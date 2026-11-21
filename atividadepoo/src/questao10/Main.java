package questao10;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(new LivroProduto("Java: Guia pratico", 89.90, "Ana Martins"));
        carrinho.adicionarProduto(new EletronicoProduto("Teclado", 149.90, 12));

        carrinho.exibirProdutos();
        System.out.println("Total do pedido: " + carrinho.calcularTotalPedido());

        try {
            new LivroProduto("Livro invalido", 0.0, "Autor");
        } catch (IllegalArgumentException exception) {
            System.out.println("Erro: " + exception.getMessage());
        }
    }
}
