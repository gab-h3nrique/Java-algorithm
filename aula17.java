import java.util.Scanner;

public class aula17 {

  public static void main(String[] args) {
    String nome[] = new String[5];
    int idade[] = new int[5];
    int parametro = 0;

    Scanner read = new Scanner(System.in);

    for (int i = 0; i <= 2; i++) {
      System.out.print("Digite seu nome: ");
      nome[i] = read.next();
      System.out.print("Digite ssua idade: ");
      idade[i] = read.nextInt();
    }
    System.out.print("Insira a idade para pesquisa: ");
    parametro = read.nextInt();

    for (int b = 0; b <= 9; b++) {
      if (idade[b] > parametro) {
        System.out.println(nome[b]);
        System.out.println(idade[b]);
      }
    }
    read.close();

  }
}
