package Labb4;

import java.util.Scanner;

public class uppgift4 {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        System.out.println("Legobitkonstrueraren\n===================");
        System.out.print("Ange antalet knoppar i sidled ");
        int sidled = inPut.nextInt();
        System.out.print("Ange antalet knoppar i höjd ");
        int hojd = inPut.nextInt();
        int total = lego(sidled, hojd);

    }

    public static int lego(int sidled1, int hojd2) {

        for (int i = 0; i < (sidled1 * 2 + 1); i++) {
            System.out.print("-");
        }

        for (int j = 0; j < hojd2; j++) {
            System.out.println();
            for (int vagg1 = 0; vagg1 < 1; vagg1++) {
                System.out.print("|");

                for (int k = 0; k < sidled1; k++) {
                    System.out.print("o ");

                }
                System.out.print("\b|");

            }
        }
        System.out.println("  ");
        for (int l = 0; l < (sidled1 * 2 + 1); l++) {
            System.out.print("-");
        }
        return 0;
    }
}
