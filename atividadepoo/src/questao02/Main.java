package questao02;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Nahyanne", 1000.0);
        conta.depositar(350.0);
        conta.sacar(800.0);
        conta.sacar(2000.0);
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
