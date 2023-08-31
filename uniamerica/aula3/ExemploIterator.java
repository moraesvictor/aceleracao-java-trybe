import java.util.ArrayList;
import java.util.Iterator;

public class ExemploIterator {

  public static void main(String[] args) {
    ArrayList<String> listaNome = new ArrayList<>();

    listaNome.add("Victor");
    listaNome.add("Dante");
    listaNome.add("Ivete");
    listaNome.add("Zeus");

    Iterator<String> iterator = listaNome.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
