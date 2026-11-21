package questao07;

public class Main {
    public static void validarAcesso(Autenticavel autenticavel, String credencial) {
        if (autenticavel.autenticar(credencial)) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }
    }

    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        Cliente cliente = new Cliente("cliente123");

        validarAcesso(diretor, "diretor-2026");
        validarAcesso(diretor, "invalida");
        validarAcesso(cliente, "cliente123");
        validarAcesso(cliente, "outra");
    }
}
