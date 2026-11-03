package SOLID.DIP;

public class EnvioEmail implements Notificacoes{
    @Override
    public void enviarNotificacoes(String mensagem) {
        System.out.println("Email: " + mensagem);        
    }
}
