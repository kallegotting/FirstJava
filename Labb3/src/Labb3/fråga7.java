package Labb3;

import java.util.Scanner;

public class fråga7 {
    public static void main(String[] args) {
        int svar;
        Scanner sc = new Scanner(System.in);
        System.out.print("Skriv in antal rader : ");
        svar = sc.nextInt();
        for (int i = 1; i <= svar; i++) {
            for (int j = (svar - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
