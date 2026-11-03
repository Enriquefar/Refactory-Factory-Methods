package Patterns.Abstract_Factory;

public class FabricaIOS extends Fabricas {
    @Override
    public Botao criarBotao() {
        return new BtnIOS();
    }

    @Override
    public Input criarInput() {
        return new InputIOS();
    }
}
