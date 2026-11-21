package questao10;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotalPedido() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void exibirProdutos() {
        for (Produto produto : produtos) {
            produto.exibirDetalhes();
            System.out.println();
        }
    }
}
