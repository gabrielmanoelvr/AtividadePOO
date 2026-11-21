package questao06;

public class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado(String cor, double lado) {
        super(cor);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
