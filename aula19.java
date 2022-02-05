import java.util.Scanner;

public class aula19 {

  public static void main(String[] args) {

    int numbers[] = new int[10];
    int numero[] = new int[10];
    int inteiro, maior = 0;

    Scanner read = new Scanner(System.in);

    System.out.println("Digite 10 numeros:");
    for (int i = 0; i <= 9; i++) {
      numbers[i] = read.nextInt();
      
    }

    System.out.print("Informe um numero inteiro: ");
    inteiro = read.nextInt();

    System.out.println("\n---------");
    
    for(int b = 0; b <= 9; b++){
        numero[b] = numbers[b] * inteiro;

        if(numero[b] > maior){
            maior = numero[b];       
        }
        System.out.println(numero[b]);
        
    }
    System.out.print("Maior número é: " + maior);
    System.out.println("\n---------");
    read.close();

  }
}
