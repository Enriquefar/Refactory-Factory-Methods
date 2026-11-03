# Refatoração: Abstract_Factory e Factory_Method

Alterações em `Patterns/Abstract_Factory` e `Patterns/Factory_Method`
(nomes de classes, pacotes e mensagens do projeto original foram mantidos).

## Problemas no código original
- Abstract_Factory/Main: `if/else` sobre `tipo` e `new FabricaIOS()` /
  `new FabricaAndroid()` direto no cliente; o fluxo de renderização
  estava duplicado em cada ramo.
- Factory_Method/FabricaNotificacoes: `if/else` sobre uma String para
  escolher `EnvioSMS`/`EnvioEmail`; toda nova variante exigia editar a classe.

## O que mudou
### Abstract_Factory
- `Fabricas` virou classe base abstrata: `criarBotao()` e `criarInput()`
  abstratos + o fluxo comum `renderizar()`, que só usa `Botao` e `Input`.
- `FabricaAndroid` e `FabricaIOS` agora estendem `Fabricas` (só criam os produtos).
- `Main` escolhe a fábrica por um `Map<String, Supplier<Fabricas>>`,
  sem `if/else`.

### Factory_Method
- `FabricaNotificacoes` virou classe abstrata com o método fábrica
  `criarNotificacoes()` e o fluxo comum `notificar()`, que só usa `IntNotificacoes`.
- Novas subclasses `FabricaEmail` e `FabricaSMS` decidem o produto.
- `Main` usa apenas a abstração `FabricaNotificacoes`.

## SOLID
- DIP: o cliente e o fluxo comum dependem de abstrações (`Fabricas`,
  `Botao`, `Input`, `FabricaNotificacoes`, `IntNotificacoes`), não de produtos concretos.
- OCP: nova variante = nova fábrica concreta; o fluxo comum da classe base não é editado.
- SRP: quem cria (fábricas) está separado de quem usa (fluxo comum / Main).

## Compilar e executar (na raiz do projeto)
    javac -d out Patterns/Abstract_Factory/*.java Patterns/Factory_Method/*.java
    java -cp out Patterns.Abstract_Factory.Main
    java -cp out Patterns.Factory_Method.Main

## Saída
    == andr ==
    Btn Android
    Input Android
    == ios ==
    Btn IOS
    Input IOS
    Enviando por Email
    Enviando por SMS
