public class Principal {

  public static void main(String[] args) {
    String nome = "Victor";
    String sobrenome = new String("Moraes");
    String nomeDeGuerra = new String("Dona Valkyria");

    System.out.println(nome);
    System.out.println(sobrenome);

    if (nome.equals(nomeDeGuerra)) {
      System.out.println("Você não tem nome de guerra");
    } else {
      System.out.println("Seu nome de guerra é: " + nomeDeGuerra);
    }
  }
}
