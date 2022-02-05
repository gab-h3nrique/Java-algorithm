import java.util.Scanner;

public class aula11 {

  public static void main(String[] args) {

 int temperatura = 0, suspeita = 0, positivo = 0, matricula = 0;
 String Positivo;

 Scanner lerTeclado = new Scanner(System.in);

        while (matricula != -1){
          System.out.print("Informe sua matricula: ");
          matricula = lerTeclado.nextInt();

          if (matricula != -1) {
          System.out.print("Informe sua temperatura: ");
          temperatura = lerTeclado.nextInt();

            if (temperatura > 37) {
              System.out.print("Você teve contato com alguem? Sim ou Não?: ");
              Positivo = lerTeclado.next();

              if (Positivo.equals("sim")) {
              positivo = positivo + 1;
              }
              else {
                suspeita = suspeita + 1;
              }
            }
          }

 }
 lerTeclado.close();
 System.out.println("A quantidade total de alunos com suspeita é: " + suspeita);
 System.out.println("A quantidade total de alunos com covid é: " + positivo);
  }
}
