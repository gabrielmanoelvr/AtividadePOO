package questao07;

public class Diretor implements Autenticavel {
    private static final String TOKEN_SEGURANCA = "diretor-2026";

    @Override
    public boolean autenticar(String credencial) {
        return TOKEN_SEGURANCA.equals(credencial);
    }
}
