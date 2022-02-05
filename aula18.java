import java.util.Scanner;

public class aula18 {

  public static void main(String[] args) {
    int notas[] = new int[10];
    int parametro = 0, zero = 0;

    Scanner read = new Scanner(System.in);

    for (int i = 0; i <= 9; i++) {
      System.out.print("Digite as notas: ");
      notas[i] = read.nextInt();
    }
    System.out.print("Digite a posição para zerar");
    parametro = read.nextInt();
    parametro = parametro - 1;
    notas[parametro] = zero;

    System.out.println("---------");
    for (int b : notas) {
      System.out.print(b);
      System.out.print(" - ");
    }
    System.out.println("\n---------");
    read.close();

  }
}
