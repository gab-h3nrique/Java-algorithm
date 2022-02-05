

import java.util.Scanner;

public class aula22 {

  public static void main(String[] args) {

    int[] notas = new int[10];

    Scanner read = new Scanner(System.in);



    System.out.println("Digite 10 numeros:");
    for (int i = 0; i <= 9; i++) {
      notas[i] = read.nextInt();
      
    }

    
    for(int b = 0; b <= 9; b++){
        System.out.println(notas[b]);
        
    }System.out.println("\n---------");

  System.out.println("\n---------");
    read.close();

  }
}
