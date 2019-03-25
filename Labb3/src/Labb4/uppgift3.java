package Labb4;

import java.util.Scanner;

public class uppgift3 {
    public static double convert(String valuta, double varde) {
        if (valuta.equals("svenska")) {
            return varde * 1.3;
        }
        else {
            return varde * 0.7;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Till vilken valuta vill du konventera? ");

        double varde = 1;

        String valuta = scan.nextLine();

        System.out.println("Hur mycket vill du konventera? ");

       double summa = scan.nextDouble();

        if (valuta.equals("svenska")) {
            System.out.println("Du kommer få " +  (convert(valuta, varde)*summa)  + " svenska kronor.");
        }
        else {
            System.out.println("Du kommer få " + (convert(valuta, varde)*summa) + " danska kronor.");
        }
    }
}
