package Patterns.Factory_Method;

/**
 * Factory Method: o fluxo comum (notificar) só usa IntNotificacoes; as
 * subclasses decidem qual produto criar. Sem if/else sobre String (OCP):
 * uma nova variante é uma nova subclasse, sem editar esta classe.
 */
public abstract class FabricaNotificacoes {
    protected abstract IntNotificacoes criarNotificacoes();

    public final void notificar() {
        IntNotificacoes notificacoes = criarNotificacoes();
        notificacoes.enviar();
    }
}
