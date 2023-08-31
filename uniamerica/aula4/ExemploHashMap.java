import java.util.HashMap;

public class ExemploHashMap {

  public static void main(String[] args) {
    HashMap<Integer, String> linguagensDeProgramacao = new HashMap<>();
    linguagensDeProgramacao.put(1, "Javascript");
    linguagensDeProgramacao.put(2, "Typescript");
    linguagensDeProgramacao.put(3, "Java");

    System.out.println("Conteúdo do hash" + linguagensDeProgramacao);

    String valor = linguagensDeProgramacao.get(2);

    System.out.println("Valor da chave 2: " + valor);
    System.out.println(
      "Mostrar apenas as chaves: " + linguagensDeProgramacao.keySet()
    );
    System.out.println("Mostrar todos os valores: " + linguagensDeProgramacao.values());
  }
}
