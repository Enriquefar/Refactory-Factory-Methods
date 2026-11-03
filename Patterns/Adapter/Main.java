package Patterns.Adapter;

public class Main {
    public static void main(String[] args) {
        Pagamentos pagamentoCartao = new PagamentoCartao();
        pagamentoCartao.pagar(50.00);
    
        // Não é necessário se consumo de API for real
        PixAPIExterna pixAPI = new PixAPIExterna();
    
        Pagamentos pagamentoPix = new PagamentoPix(pixAPI);

        pagamentoPix.pagar(50.00);
    }
}
