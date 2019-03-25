package Labb4;

import java.util.Scanner;

public class uppgift2 {
    public static void meny() {
        System.out.println("Legoteman");
        System.out.println("=========");
        System.out.println("");
        System.out.println("1. Jurassic World");
        System.out.println("2. Scooby-Doo");
        System.out.println("3. Star Wars");
        System.out.println("4. Speed Champions");
        System.out.println("0. Avsluta");
        System.out.println("");
    }
    public static String jurassicWorld() {
        return "Ditt val: 1 \n Jurassic World is a theme introduced in May 2015 and reintroduced in May 2018. " +
                "It is based on the Jurassic Park franchise and was released alongside the Jurassic World movie. " +
                "The sets are based off of Jurassic World and Jurassic World: " +
                "Fallen Kingdom with only one set so far based off of Jurassic Park.";}

    public static String scoobyDoo() {
        return "Ditt val: 2 \n Scooby-Doo is a theme released in August 2015, based on the franchise of the same name. " +
                "The sets feature the main characters, known as the Mystery Gang, solving mysteries based on those of the show.";
    }

    public static String starWars() {
        return "Ditt val: 3 \n Star Wars is a current licensed theme introduced in 1999. " +
                "The theme is based on material from the Star Wars franchise of films, cartoon series, comic books, video games, and other media. " +
                "The theme covers all eight main films, along with The Clone Wars movie and TV series, the Star Wars: Rebels TV series, and anthology films such as Rogue One: A Star Wars Story. " +
                "Also, some Expanded Universe sets have been released, with four The Old Republic sets released in the second wave of 2012, the first and second wave of 2013, and one The Force Unleashed set released in 2008. " +
                "The current licence for LEGO Star Wars will expire in 2022." +
                "Due to the amount of detail required to describe the Star Wars storyline properly, please scroll past the set list for information regarding the theme's detailed lore.";
    }

    public static String speedChampions() {
        return "Ditt val: 4 \n Speed Champions is a theme introduced in March of 2015. In this theme, " +
                "-accurate models of racing cars belonging to existing brands are created using LEGO bricks.";
    }

    public static String avsluta() {
                return "Ditt val: 0 \n Avsluta";
        }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        meny();
        System.out.println("Vilket tema vill du ha?: ");
        int svar = scan.nextInt();




        if (svar == 1) {
            System.out.println(jurassicWorld());
        }
        else if (svar == 2) {
            System.out.println(scoobyDoo());
        }
        else if (svar == 3) {
            System.out.println(starWars());
        }
        else if (svar == 4) {
            System.out.println(speedChampions());
        }
        else if (svar == 0) {
            System.out.println(avsluta());
        }
    }
}

