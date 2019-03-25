package Labb7;

import java.util.ArrayList;
import java.util.Iterator;

public class Uppgift2 {
    public static void main(String[] args) {
        ArrayList<Djur> djur = new ArrayList<>();
        Daggdjur giraff = new Daggdjur("Giraff", "panthera", 800, "tooot", "gul och brun", false);
        Daggdjur schimpans = new Daggdjur("Schimpans", "Pan troglodytes", 50, "hohoho", "svart", false);
        Daggdjur rhino = new Daggdjur("Noshärning", "rhinoceros", 2300, "huchh", "grå", false);

            djur.add(giraff);
            djur.add(schimpans);
            djur.add(rhino);

        Iterator itr = djur.iterator();

        while (itr.hasNext()){
            Djur hej = (Djur) itr.next();
            System.out.println("En " + hej.getLatisktNamn() + " väger " + hej.getVikt() + " kg och säger " + hej.ljud());
        }
    }
}
