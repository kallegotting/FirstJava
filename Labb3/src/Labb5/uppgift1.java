package Labb5;

import java.util.Scanner;

public class uppgift1 {
        public static double summa(double[] tal){
            double total = 0.0;

            for (int i = 0; i < tal.length; i++) {
                total += tal[i];
            }
            return total;
        }

        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            double[] inmatning;

            inmatning = new double[4];

            for (int i = 0; i < 4; i++) {
                System.out.print("Heltal " + (i + 1) + " av 4: ");
                inmatning[i] = scan.nextDouble();
            }
            System.out.println("Summan blir: " + summa(inmatning));
        }
    }