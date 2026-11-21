package questao07;

public class Cliente implements Autenticavel {
    private String senha;

    public Cliente(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String credencial) {
        return senha.equals(credencial);
    }
}
