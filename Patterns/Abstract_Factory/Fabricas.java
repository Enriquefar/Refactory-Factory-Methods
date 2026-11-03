package Patterns.Abstract_Factory;

/**
 * Abstract Factory + fluxo comum de renderização.
 *
 * DIP: usa somente as abstrações Botao e Input; não conhece nenhuma classe
 * concreta. OCP: uma nova fábrica concreta (ex.: FabricaWeb) só estende esta
 * classe, sem que renderizar() precise ser editado.
 */
public abstract class Fabricas {
    public abstract Botao criarBotao();
    public abstract Input criarInput();

    public final void renderizar() {
        Botao botao = criarBotao();
        Input input = criarInput();

        botao.renderizarBotao();
        input.renderizarInput();
    }
}
