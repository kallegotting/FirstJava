package Labb6;

import java.util.Arrays;

public class Uppgift2 {
    public static void main(String[] args) {
        PlanetM planetEtt = new PlanetM("Jupiter", 5, 2, 100, 200);

        planetEtt.addMane("Europa");
        planetEtt.addMane("Io");

        PlanetM planetTvo = new PlanetM("Uranus", 7, 4, 19824, 827391);
        planetTvo.addMane("Umbriel");
        planetTvo.addMane("Miranda");
        planetTvo.addMane("Ariel");




        System.out.println("Planeten heter " + planetEtt.getNamn() + " och har följande månar: \n");
        int i = 1;
        for (String m: planetEtt.showManar()) {
            System.out.println("Måne " + i + "heter: " + m);
            i++;
        }

        System.out.println();


        System.out.println("Planeten heter " + planetTvo.getNamn() + " och har följande månar: \n");
        int k = 1;
        for (String n: planetTvo.showManar()) {
            System.out.println("Måne " + k + " heter: " + n);
            k++;
        }




    }
}
