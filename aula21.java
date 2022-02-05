import java.util.Scanner;

public class aula21 {

  public static void main(String[] args) {

    int numbers[] = new int[10];

    Scanner read = new Scanner(System.in);

    System.out.println("Digite 10 numeros:");
    for (int i = 0; i <= 9; i++) {
      numbers[i] = read.nextInt();
      
    }

    System.out.println("\n---------");
    
    for(int b = 0; b <= 9; b++){
        System.out.println(numbers[b]);
        
    }System.out.println("\n---------");

    for(int c = numbers.length -1; c >=0; c--){
        System.out.println(numbers[c]);
        
    }System.out.println("\n---------");
    read.close();

  }
}

