package Patterns.Composite;

public class Main {
    public static void main(String[] args) {
        Pasta home = new Pasta("Home");
        Pasta docs = new Pasta("Documentos");
        
        Arquivo foto = new Arquivo("Foto");
        Arquivo contrato = new Arquivo("Contrato");
        
        home.adicionarItem(docs);
        home.adicionarItem(foto);

        docs.adicionarItem(contrato);
        
        home.abrir();
    }
}
