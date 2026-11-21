package questao06;

public abstract class FiguraGeometrica {
    protected String cor;

    public FiguraGeometrica(String cor) {
        this.cor = cor;
    }

    public abstract double calcularArea();
}
