package questao04;

public class Gerente extends Funcionario {
    private double bonusEscopo;

    public Gerente(String nome, double salarioBase, double bonusEscopo) {
        super(nome, salarioBase);
        this.bonusEscopo = bonusEscopo;
    }

    @Override
    public double calcularVencimentos() {
        return salarioBase + salarioBase * 0.20 + bonusEscopo;
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Cargo: Gerente");
        System.out.println("Bonus de escopo: " + bonusEscopo);
        System.out.println("Vencimentos: " + calcularVencimentos());
    }
}
