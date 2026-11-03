package Patterns.Abstract_Factory;

public class FabricaAndroid extends Fabricas {
    @Override
    public Botao criarBotao() {
        return new BtnAndroid() ;
    }

    @Override
    public Input criarInput() {
        return new InputAndroid();
    }
}
