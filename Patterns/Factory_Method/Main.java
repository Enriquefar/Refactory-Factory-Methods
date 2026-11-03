package Patterns.Factory_Method;

import java.util.List;

/** O cliente só enxerga a abstração FabricaNotificacoes. */
public class Main {
    public static void main(String[] args) {
        List<FabricaNotificacoes> fabricas = List.of(new FabricaEmail(), new FabricaSMS());

        fabricas.forEach(FabricaNotificacoes::notificar);
    }
}
