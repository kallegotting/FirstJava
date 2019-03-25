package Labb5;

import java.util.Scanner;

public class uppgiftnya2 {
    public static void main(String[] args) {
        System.out.println("Bilhastigheter i km");

        Scanner inmat = new Scanner(System.in);

        double average = 0.0;
        int[] hastighet;
        hastighet = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ange hastighet i Km " + (i + 1) + ": ");
            hastighet[i] = inmat.nextInt();
        }
        int min = hastighet[0];
        int max = hastighet[0];

        for (int j = 0; j < hastighet.length; j++) {
            if (max < hastighet[j]) {
                max = hastighet[j];
            }else if (min > hastighet[j]){
                min = hastighet[j];
            }
        }

        for (int i = 0; i < 5; i++) {
            average += hastighet[i];
        }


        System.out.println();
        System.out.println("Högsta hastigheten är " + max);
        System.out.println("");
        System.out.println("Lägsta hastigheten är " + min);
        System.out.println("");
        System.out.println("Medelhastigheten är " + (average / 5));

    }
}
