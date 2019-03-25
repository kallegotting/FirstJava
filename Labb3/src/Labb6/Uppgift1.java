package Labb6;

public class Uppgift1 {
    public static void main(String[] args) {

        Planet planetEtt = new Planet("Jorden", 3, 1, 152097701, 147098074);
        Planet planetTvo = new Planet("Mars", 4, 2,  249209300,  206669000);

        System.out.println(planetEtt.getNamn() + ":");
        System.out.println("Plats: " + planetEtt.getPlats());
        System.out.println("Månar: " + planetEtt.getManar());
        System.out.println("Aphelium: " + planetEtt.getAphelium() + " km");
        System.out.println("Perihelium: " + planetEtt.getPerihelium() + " km");
        System.out.println();
        System.out.println(planetTvo.getNamn() + ":");
        System.out.println("Plats: " + planetTvo.getPlats());
        System.out.println("Månar: " + planetTvo.getManar());
        System.out.println("Aphelium: " + planetTvo.getAphelium() + " km");
        System.out.println("Perihelium: " + planetTvo.getPerihelium() + " km");
    }
}
