package Labb7;

import java.util.Scanner;

public class Uppgift4 {
    public static void meny() {
        System.out.println("Djurmeny");
        System.out.println("========\n");
        System.out.println("1. Visa djur i ordning");
        System.out.println("2. Lägg till ett djur");
        System.out.println("3. Avsluta\n");
        System.out.print("==>");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val;

        meny();
        val = scan.nextInt();

        if (val == 1){

        }
    }
}
