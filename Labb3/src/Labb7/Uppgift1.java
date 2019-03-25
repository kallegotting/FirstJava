package Labb7;

public class Uppgift1 {
    public static void main(String[] args) {
        Fagel talgoxe = new Fagel("talgoxe", "cit", 0.016, "piiiiiip", true, true, "Träd");
        Daggdjur elefant = new Daggdjur("elefant", "elephantus", 6000.0, "thjoot", "grå", false);
        Reptil krokodil = new Reptil("Krokodil", "crocodili", 750.0, "wraaaww", "gatten", false);


        System.out.println("En galen " + talgoxe.getNamn() + " låter galet, ungefär såhär: " + talgoxe.ljud());
        System.out.println("Jag blir jagad av en " + elefant.getNamn() + " den låter jättemycket, lyssna: " + elefant.ljud());
        System.out.println("Jag blev uppäten av en " + krokodil.getNamn() + " den lät: " + krokodil.ljud());
    }
}
