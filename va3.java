
import java.util.Scanner;

public class va3 {

    public static void main(String[] args) {

        int[] salarios = new int[4];
        int[] salariosATL = new int[4];
        int total = 0, media = 0;

        // int vinte = 20, cem = 100;

        Scanner read = new Scanner(System.in);

        System.out.println("Digite 4 salarios:");
        for (int i = 0; i <= 3; i++) {
            salarios[i] = read.nextInt();
        }

        for (int a = 0; a <= 3; a++) {
            if (salarios[a] <= 280) {
                salariosATL[a] = salarios[a] + ((salarios[a] * 20) / 100);
            }
            if (salarios[a] > 280 & salarios[a] <= 700) {
                salariosATL[a] = salarios[a] + ((salarios[a] * 15) / 100);
            }
            if (salarios[a] > 700 & salarios[a] <= 1500) {
                salariosATL[a] = salarios[a] + ((salarios[a] * 10) / 100);
            }
            if (salarios[a] > 1500) {
                salariosATL[a] = salarios[a] + ((salarios[a] * 5) / 100);
            }
        };




          for (int c = 0; c <=3; c++){
            total = total + salariosATL[c];
            media = total / 4;
          }
       






        System.out.println("\n----todos os salarios atualizados-----");
        for (int b = 0; b <= 3; b++) {
            System.out.println(salariosATL[b]);

        }
        System.out.println("\n----salarios abaixo de 750-----");
        for (int d = 0; d <= 3; d++) {
        if (salariosATL[d]< 750) {
            System.out.println(salariosATL[d]);
        }

        }
        System.out.println("\n----media dos salarios-----");


        System.out.println(media);
        System.out.println("\n---------");

        read.close();

    }
}
