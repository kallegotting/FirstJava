package Labb4;

import java.util.Scanner;

public class uppgift5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ange ett tänkt lösenord, eller \"avsluta\" för att avsluta: ");
            String ord = scanner.nextLine();

            if (ord.equalsIgnoreCase("avsluta")) {
                System.out.println("Hej då!");
                break;
            }

            if (valid(ord)) {
                System.out.println("Lösenordet är godkänt");
            } else {
                System.out.println("Lösen ordet är inte godkänt");
            }
        }

    }

    public static boolean valid(String ord) {
        boolean isValid = langd(ord) && versaler(ord) && siffror(ord) && tecken(ord);
        return isValid;
    }

    public static boolean langd(String ord) {
        return ord.length() >= 8;
    }

    public static boolean versaler(String ord) {
        int antalVersaler = 0;

        for (int i = 0; i < ord.length(); i++) {
            if (Character.isUpperCase(ord.charAt(i))) {
                antalVersaler++;
            }
        }
        return antalVersaler >= 2;
    }

    public static boolean siffror(String ord) {
        int antalSiffror = 0;
        for (int i = 0; i < ord.length(); i++) {
            if (Character.isDigit(ord.charAt(i))) {
                antalSiffror++;
            }
        }
        return antalSiffror >= 4;
    }

    public static boolean tecken(String ord) {
        int tecken = 0;
        for (int i = 0; i < ord.length(); i++) {
            if (!Character.isLetterOrDigit(ord.charAt(i))) {
                tecken++;
            }
        }
        return tecken >= 2;
    }
}
