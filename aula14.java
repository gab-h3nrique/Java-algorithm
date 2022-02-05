 
import java.util.Scanner;

public class aula14 {
    
  public static void main(String[] args) {

    Scanner lerTeclado = new Scanner(System.in);
    
    System.out.println("Bem vindo ao sistema. Digite 1 saque, 2 deposito, 3 transferência, 4 saldo.");

    int opcao = 0, saldo = 1500, input = 0, saldoAtt =0;
    String nome = " ";


    System.out.print("Digite a opção:");
    opcao = lerTeclado.nextInt();
    switch (opcao) {

      case 1:
      System.out.println("Qual valor deseja sacar?");
      input = lerTeclado.nextInt();
      if(input <= saldo) {
      saldoAtt = saldo - input;
      System.out.println("Você sacou " + input + " Reais, e seu saldo atualmente é: " + saldoAtt + " Reais.");
      } else {
      System.out.println("Seu saldo é insuficiente.");
      }
        break;

      case 2:
      System.out.println("Qual valor deseja depositar?");
      input = lerTeclado.nextInt();
      saldoAtt = saldo + input;
      System.out.println("Você depositou " + input + " Reais, e seu saldo atualmente é: " + saldoAtt + " Reais.");
        break;

      case 3:
      System.out.println("Qual valor deseja Transferir?");
      input = lerTeclado.nextInt();
      System.out.print("Pra quem deseja Transferir?Nome:");
      nome = lerTeclado.next();
      if(input <= saldo) {
      saldoAtt = saldo - input;
      System.out.println("Você transferiu " + input + " Reais para: "+ nome +" , e seu saldo atualmente é: " + saldoAtt + " Reais.");
      } else {
      System.out.println("Seu saldo é insuficiente para transferência.");
      }
        break;
      case 4:
      System.out.println("Seu saldo é: " + saldo);
        break;

      default:
        break;
    } 
    lerTeclado.close();
    System.out.println("Fim");
    }
}

