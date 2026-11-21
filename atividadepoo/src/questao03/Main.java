package questao03;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma de inteiros: " + calculadora.somar(10, 20));
        System.out.println("Soma de decimais: " + calculadora.somar(10.5, 20.25));
        System.out.println("Soma tripla: " + calculadora.somar(10, 20, 30));
    }
}
