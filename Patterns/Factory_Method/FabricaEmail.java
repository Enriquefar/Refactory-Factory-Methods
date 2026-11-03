package Patterns.Factory_Method;

public class FabricaEmail extends FabricaNotificacoes {
    @Override
    protected IntNotificacoes criarNotificacoes() {
        return new EnvioEmail();
    }
}
