import java.util.Scanner;

public class aula15 {

  public static void main(String[] args) {
    int[] Notas = new int[15];
    int contador = 0, soma = 0, tamanho = 0, media = 0;

    Scanner lerTeclado = new Scanner(System.in);

 for (int i=0; i<3; i++) {
    System.out.print("Digite suas notas: ");
    contador = lerTeclado.nextInt();
    Notas[i] = contador;
    soma += Notas[i];
    tamanho ++;
    media = soma / tamanho;
 }
 System.out.println("---------");
 System.out.println("A soma de todas as notas é: " + soma);
 System.out.println("A média das notas é: " + media);
 System.out.println("Todas as notas");
 for (int b : Notas) {
     System.out.print(b);
     System.out.print(" - ");
 }
    
    lerTeclado.close();

  }
}
