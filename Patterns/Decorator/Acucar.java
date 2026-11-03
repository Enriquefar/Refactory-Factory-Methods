package Patterns.Decorator;

public class Acucar extends Decoradores {
    public Acucar(Bebidas bebidas){
        super(bebidas);
    }
    
    @Override
    public double getPreco() {
        return bebida.getPreco() + 0.50;
    }
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Adicional de Açucar";
    }
}
