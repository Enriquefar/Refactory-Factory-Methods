package Patterns.Adapter;

// Não tenho controle sobre essa classe.
public class PixAPIExterna {
    public void pgtPix(double valor){
        System.out.println("Pagamento com pix: U$" + valor);
    }
}
