package Patterns.Abstract_Factory;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Raiz de composição: único lugar que conhece as fábricas concretas.
 * A seleção é feita por tabela de registro (sem if/else). Para uma nova
 * plataforma basta criar a fábrica e registrá-la aqui.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Supplier<Fabricas>> plataformas = new LinkedHashMap<>();
        plataformas.put("andr", FabricaAndroid::new);
        plataformas.put("ios", FabricaIOS::new);

        plataformas.forEach((tipo, criador) -> {
            System.out.println("== " + tipo + " ==");
            Fabricas fabrica = criador.get();
            fabrica.renderizar();
        });
    }
}
