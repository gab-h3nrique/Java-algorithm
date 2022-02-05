import java.util.Scanner;

public class aula20 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String linhaA[] = new String[5];
        String linhaB[] = new String[5];
        String linhaC[] = new String[5];
        String opcao, entrada = "";
        int carteira = 0, contador = 0, start = 0, teste = 0;

        System.out.print("Deseja iniciar o programa? (S/N)");
        for (int x = 0; x <= 4; x++) {
            linhaA[x] = "Livre";
            linhaB[x] = "Livre";
            linhaC[x] = "Livre";
        }
        entrada = read.next();

        if (entrada.equals("s")) {
            if (teste !=0) {
                contador = 20;
            } else {

            System.out.print("Selecione uma opção:");
            System.out.println("\n1-Comprar ticket.");
            System.out.println("\n2-Imprimir ascentos disponíveis.");
            System.out.println("\n3-sair do programa.");
            start = read.nextInt();

            switch(start){
                case 1:

            while (contador <= 20) {

                System.out.println("\n---------");
                System.out.print("Selecione seu local de ascento.");
                System.out.println("\n---------");
                System.out.println(" Local    -1-        -2-        -3-        -4-        -5-");
                System.out.print(" A -> ");
                for (String b : linhaA) {
                    System.out.print(" - ");
                    System.out.print(b);
                    System.out.print(" - ");
                }
                System.out.println(" ");
                System.out.print(" B -> ");
                for (String b : linhaB) {
                    System.out.print(" - ");
                    System.out.print(b);
                    System.out.print(" - ");
                }
                System.out.println(" ");
                System.out.print(" C -> ");
                for (String b : linhaC) {
                    System.out.print(" - ");
                    System.out.print(b);
                    System.out.print(" - ");
                }
                System.out.println(" ");

                System.out.print("Informe a fileira: ");
                opcao = read.next();
                System.out.print("Informe a poltrona: ");
                carteira = read.nextInt();
                carteira--;
                switch (opcao) {
                case ("a"):
                    if (linhaA[carteira].equals("Livre")) {
                        linhaA[carteira] = "Ocupa";
                        for (String b : linhaA) {
                            System.out.print(" - ");
                            System.out.print(b);
                            System.out.print(" - ");
                        }
                    } else {
                        System.out.println("\n---------");
                        System.out.print("Ascento já ocupado!");
                    }
                    break;
                case ("b"):
                    linhaB[carteira] = "Ocupa";
                    break;
                case ("c"):
                    linhaC[carteira] = "Ocupa";
                    break;
                }
            } break;
            case 2:
            System.out.print("oi 2");
              break;
            case 3:
            System.out.print("oi 3");
              break;
        }contador = 20;}
        } else {
            System.out.println("\n---------");
            System.out.print("Fim do programa.");
        }

        System.out.println("\n---------");
        read.close();

    }
}
