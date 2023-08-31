import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ExemploComparator {

  public static void main(String[] args) {
    ArrayList<String> listaNome = new ArrayList<>();

    listaNome.add("Victor");
    listaNome.add("Dante");
    listaNome.add("Ivete");
    listaNome.add("Zeus");

    Comparator<String> comparator = Collections.reverseOrder();

    Collections.sort(listaNome, comparator);

    System.out.println("Elementos após a ordenação: ");

    for (String nome : listaNome) {
      System.out.println(nome);
    }
  }
}
