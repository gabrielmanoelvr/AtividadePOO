package questao06;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado("Azul", 5.0);
        Circulo circulo = new Circulo("Verde", 3.0);

        System.out.println("Area do quadrado: " + quadrado.calcularArea());
        System.out.println("Area do circulo: " + circulo.calcularArea());
    }
}
