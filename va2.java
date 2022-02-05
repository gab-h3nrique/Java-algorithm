

import java.util.Scanner;

public class va2 {

  public static void main(String[] args) {

    int muitoRuim = 0, ruim = 0, bom = 0, muitoBom = 0, excelente = 0, excepcional = 0, escolha = 0, total =0; 

    Scanner read = new Scanner(System.in);



    System.out.println("Digite sua nota de satisfação. PARA SAIR DIGITE -1");
    while (escolha != -1) {
        System.out.println("Digite sua nota. 1-Muito Ruim - 2-Ruim - 3-Bom - 4-Muito Bom - 5-Excelente - 6-Excepcional");

        escolha = read.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Votado em Muito Ruim");
                muitoRuim = muitoRuim + 1;
        
            
            break;

            case 2:
            System.out.println("Votado em Ruim");
                ruim = ruim + 1;
            
            
            break;

             case 3:
                
            System.out.println("Voado em Bom");
                bom = bom + 1;
            
            break;

            case 4:
                
            System.out.println("Votado em Muito Bom");
                muitoBom = muitoBom + 1;
            
           
              break;

             case 5:
            
            System.out.println("Votado em Excelente");
                excelente = excelente + 1;
                
              break;

            case 6:
            
            System.out.println("Votado em Excepcional");
                excepcional = excepcional + 1;
                
                break;

                 
            }
    }
    total = muitoRuim + ruim + bom + muitoBom + excelente + excepcional;
  System.out.println("\n---------");

  System.out.println("\nTotal de votos de satisfação foi: " + total);

  System.out.println("\n---------");
    read.close();

  }
}
