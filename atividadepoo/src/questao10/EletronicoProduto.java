package questao10;

public class EletronicoProduto extends Produto {
    private int mesesGarantia;

    public EletronicoProduto(String nome, double preco, int mesesGarantia) {
        super(nome, preco);
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Eletronico: " + getNome());
        System.out.println("Garantia: " + mesesGarantia + " meses");
        System.out.println("Preco: " + getPreco());
    }
}
