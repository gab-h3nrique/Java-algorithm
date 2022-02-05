import java.util.Scanner;

public class aula10 {

  public static void main(String[] args) {
    int quantidade = 0, valor = 0, totalVendido = 0, totalQuantidade = 0, contador = 1;

    Scanner scanner = new Scanner(System.in);
    while (contador != -1) {

    
        System.out.println("Informe a quantidade do produto: ");
        quantidade = scanner.nextInt();

        System.out.println("Informe o valor do intem comprado: ");
        valor = scanner.nextInt();
         
        contador = valor + quantidade;

        if (quantidade != -1 & valor != -1) {
        totalQuantidade = totalQuantidade + quantidade;
        totalVendido = totalVendido + (quantidade*valor);

      }
    }
    scanner.close();
    System.out.println("O total de produto foi: " + totalQuantidade);
    System.out.println("O preço total foi: " + totalVendido + " Reais");
  }
}
