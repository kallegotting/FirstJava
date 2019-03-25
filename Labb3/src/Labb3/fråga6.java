package Labb3;

import java.util.Scanner;

public class fråga6 {
    public static void main(String[] args) {
        Scanner inmat = new Scanner(System.in);
        System.out.println("Hur många lager?");

        int svar = inmat.nextInt();

        int insteg = svar;


        for (int i = 0; i < svar; i++) {
            for (int j = 0; j < insteg; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            insteg--;
            System.out.println();
        }
    }
}
