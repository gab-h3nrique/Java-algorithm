import java.util.Scanner;

public class aula16 {

  public static void main(String[] args) {
    int[] value = new int[10];
    int contador = 0;
   

    Scanner read = new Scanner(System.in);

 for (int i=0; i<10; i++) {
    System.out.print("Digite suas notas: ");
   contador = read.nextInt();
    value[i] = contador * 3 ;
    
 }
 System.out.println("---------");
 for (int b : value) {
     System.out.print(b);
     System.out.print(" - ");
 }System.out.println("\n---------");  
read.close();

  }
}
