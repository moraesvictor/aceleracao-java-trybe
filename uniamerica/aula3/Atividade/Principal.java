/**
 * Atividade Prática
 * Sabemos que existem algumas maneiras de armazenar uma coleção de objetos e
 * existem várias classes do Java Collections Framework, que armazenam esses objetos,
 * entre elas a classe ArrayList. Diante disso, desenvolva uma classe em Java que cria uma lista de números inteiros,
 * recebe os números digitados pelo usuário e ao final,
 * mostra os números armazenados e a soma total desses números.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    ArrayList<Integer> numberList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite números inteiros (digite -1 para encerrar):");

    int num;
    while (true) {
      num = scanner.nextInt();
      if (num == -1) {
        break;
      }
      numberList.add(num);
    }

    System.out.println("Números armazenados:");
    for (Integer number : numberList) {
      System.out.println(number);
    }

    int sum = 0;
    for (Integer number : numberList) {
      sum += number;
    }

    System.out.println("Soma total: " + sum);

    scanner.close();
  }
}
