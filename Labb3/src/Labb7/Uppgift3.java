package Labb7;

import java.util.*;
import java.util.Collections;

public class Uppgift3 {

    public static void main(String[] args) {
        Fagel kollibri = new Fagel("Kollibri", "Colubris", 0.003, "trihh", false, true, "träd");
        Reptil Alligator = new Reptil("Alligator", "Alligator", 230, "WRAAK", "vatten", false);
        Daggdjur katt = new Daggdjur("Katt", "Feles", 4.5, "mijawh", "grå, vit, svart", true);
        Fagel trana = new Fagel("Trana", "Grus", 5, "TOOOOt", true, true, "åkrar");
        Reptil pytonorm = new Reptil("Pytonorm", "Python", 160, "shhhshshh", "snår och träd", false);
        Daggdjur zebra = new Daggdjur("Zebra", "Equus", 400, "knägg", "vit/svart", false);

        ArrayList<Djur> animalSort = new ArrayList<>();

        animalSort.add(kollibri);
        animalSort.add(Alligator);
        animalSort.add(katt);
        animalSort.add(trana);
        animalSort.add(pytonorm);
        animalSort.add(zebra);

        Collections.sort(animalSort);
        for (Djur str : animalSort) {
                System.out.println(str.toString());

            }
        }
    }


