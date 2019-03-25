package Labb5;

import java.util.Scanner;

public class uppgift3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] heltal1;
        int svar;

        System.out.println("Ange hur många heltal som ska läsas in: ");
        svar = scan.nextInt();
        heltal1 = new int[svar];

        for (int i = 0; i < svar; i++) {
            System.out.println("Skriv in tal " + (i + 1) + " av " + svar + ": ");
            heltal1[i] = scan.nextInt();
        }
        System.out.print("Talen i omvänd ordning blir: ");

        for(int j = heltal1.length-1; j >= 0; j--) {
            if (j > 0) {
            System.out.print(heltal1[j] + ", ");
        }
        else {
                System.out.print(heltal1[j]);
            }
        }
    }
}