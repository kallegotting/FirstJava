package Labb3;

import java.util.Random;

public class fråga4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int kast;
        int resultat1 = 0;
        int resultat2 = 0;
        int resultat3 = 0;
        int resultat4 = 0;
        int resultat5 = 0;
        int resultat6 = 0;


        for (int i = 1; i <=500 ; i++) {
          kast = rnd.nextInt(6 )+ 1;

          if (kast == 1) {
              resultat1++;
          }
          else if (kast == 2) {
              resultat2++;
          }
          else if (kast == 3) {
              resultat3++;
          }
          else if (kast == 4) {
              resultat4++;
          }
          else if (kast == 5) {
              resultat5++;
          }
          else {
              resultat6++;
          }
        }
        System.out.print("\n" + "Ettor (" + resultat1 + ")");
        for (int j = 0; j<resultat1; j++) {
            System.out.print("*");
        }
        System.out.print("\n" + "Tvåor (" + resultat2 + ")");
        for (int k = 0; k<resultat2; k++) {
            System.out.print("*");
        }
        System.out.print("\n" + "Treor (" + resultat3 + ")");
        for (int l = 0; l<resultat3; l++) {
            System.out.print("*");
        }
        System.out.print("\n" + "Fyror (" + resultat4 + ")");
        for (int m = 0; m<resultat4; m++) {
            System.out.print("*");
        }
        System.out.print("\n" + "Femmor (" + resultat5 + ")");
        for (int n = 0; n<resultat5; n++) {
            System.out.print("*");
        }
        System.out.print("\n" + "Sexor (" + resultat6 + ")");
        for (int o = 0; o<resultat6; o++) {
            System.out.print("*");
        }
    }
}
