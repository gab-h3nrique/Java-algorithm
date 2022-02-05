
import java.util.Scanner;

public class aula12 {
    
  public static void main(String[] args) {

    double mediaMachucados = 0, jogos = 0;
    int custo = 0, custoTotal = 0, machucados = 0;

    Scanner lerTeclado = new Scanner(System.in);

    System.out.println("Bem vindo ao controle de gestão");
      System.out.print("Quantos jogos o Tabajara FC fez nesta temporada: ");
        jogos = lerTeclado.nextInt();
      System.out.print("Quantos jogadores machuracam nessa temporada? ");
        machucados = lerTeclado.nextInt();

      System.out.print("Qual custo em reais por jogador machucado? ");
        custo = lerTeclado.nextInt();






        custoTotal = custo * machucados;
        mediaMachucados = machucados / jogos;

    
    lerTeclado.close();
    System.out.println("Seu time teve " + mediaMachucados + "  jogadores machucados por partida");
    System.out.println("E seu custo de manutenção total nessa temporada foi: " + custoTotal);

     }
}
