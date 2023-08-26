// Tipos primitivos de Java

public class TiposPrimitivosByte {

  public static void main(String[] args) {
    byte b = 9;
    System.out.println(b);
  }
}

public class TiposPrimitivosShort {

  public static void main(String[] args) {
    short num = 300;
    short formatadaComUnderscore = 20_000; // variável
    System.out.println(num);
    System.out.println(formatadaComUnderscore); // 20000
  }
}

public class TiposPrimitivosLong {

  public static void main(String[] args) {
    long numA = 102040;
    long numB = 102030405060L; // adicionado L no final para indicar que estamos inserindo um valor do tipo long
    System.out.println(numA);
    System.out.println(numB);
  }
}
