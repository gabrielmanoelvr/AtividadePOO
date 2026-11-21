package questao09;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Ana", 300.0);

        try {
            conta.sacar(500.0);
        } catch (SaldoInsuficienteException exception) {
            System.out.println("Erro: " + exception.getMessage());
        }

        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
