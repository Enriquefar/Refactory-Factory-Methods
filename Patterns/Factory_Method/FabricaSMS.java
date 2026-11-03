package Patterns.Factory_Method;

public class FabricaSMS extends FabricaNotificacoes {
    @Override
    protected IntNotificacoes criarNotificacoes() {
        return new EnvioSMS();
    }
}
