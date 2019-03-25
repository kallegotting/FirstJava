package Labb3;


import java.util.Random;
import java.util.Scanner;

public class fråga5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner inmat = new Scanner(System.in);

        char bok1;
        char bok2;

        System.out.print("Hur många registreringsnummer vill du ha? ");
        int inMat = inmat.nextInt();

        for (int h = 0; h < inMat; h++) {

            for (int i = 0; i < 2; i++) {
                String alphabet1 = "ABCDEFGHJKLMNOPRSTUVXY";
                bok1 = alphabet1.charAt(rnd.nextInt(22));
                System.out.print(bok1);

            }
            for (int j = 1; j <= 2; j++) {
                int siffa = rnd.nextInt(9) + 1;
                System.out.print(siffa);

            }
            System.out.print(" ");

            for (int k = 0; k < 3; k++) {
                String alphabet2 = "ABCDEFGHJKLMNOPRSTUVXYZ";
                bok2 = alphabet2.charAt(rnd.nextInt(23));
                System.out.print(bok2);

            }
            System.out.println();
        }
    }
}