package questao04;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", 3000.0);
        Gerente gerente = new Gerente("Mariana", 5000.0, 1200.0);

        System.out.println("Vencimentos do funcionario: " + funcionario.calcularVencimentos());
        funcionario.imprimirFicha();

        System.out.println();
        gerente.imprimirFicha();

        Funcionario funcionarioGerente = gerente;
        System.out.println("Polimorfismo: " + funcionarioGerente.calcularVencimentos());
        funcionarioGerente.imprimirFicha();
    }
}
