package Patterns.Adapter;

// Essa classe é um Adapter
public class PagamentoPix implements Pagamentos {
    private PixAPIExterna pixAPI;

    public PagamentoPix(PixAPIExterna pixAPI){
        this.pixAPI = pixAPI;
    }


    @Override
    public void pagar(double valor) {
        valor = valor / 5.20;
        pixAPI.pgtPix(valor);
    }
}
