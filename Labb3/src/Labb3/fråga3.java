package Labb3;

import java.util.Random;
import java.util.Scanner;

public class fråga3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Roger Walters frågar, hur många tärningar? ");

        int antal = scan.nextInt();
        int kast;
        int sammanställning = 0;



        for (int i = 1; i <= antal; i++) {
            kast = rnd.nextInt(6) + 1;

            if (i >= antal) {
                System.out.print(kast);
                sammanställning += kast;
            }
            else {
                System.out.print(kast + " + ");
                sammanställning += kast;
            }
        }
        System.out.print(" = " + sammanställning);
    }
}
