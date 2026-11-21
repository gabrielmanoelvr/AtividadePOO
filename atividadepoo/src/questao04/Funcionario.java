package questao04;

public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularVencimentos() {
        return salarioBase + salarioBase * 0.10;
    }

    public void imprimirFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario base: " + salarioBase);
    }
}
