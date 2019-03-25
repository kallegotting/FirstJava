package Labb6;

import java.util.Scanner;

public class Uppgift4 {
    public static void meny() {
        System.out.println("Solsystemet");
        System.out.println("===========\n");
        System.out.println("1. Visa inlagda planeter");
        System.out.println("2. Lägg till planet");
        System.out.println("3. Avsluta\n");
        System.out.print("Gör ditt val här ---> ");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Boolean go = true;
        int val;
        int noOfPlanets = 0;

        PlanetMedManobjekt[] planeter = new PlanetMedManobjekt[8];



        do {
            meny();
            val = scan.nextInt();
            if (val == 1) {
                if (noOfPlanets >= 1) {
                    for (int i = 0; i < noOfPlanets; i++) {
                        PlanetMedManobjekt showPlanet = planeter[i];
                        String namn = showPlanet.getNamn();
                        int plats = showPlanet.getPlats();
                        int antalMonar = showPlanet.getManar();
                        int aphelium = showPlanet.getAphelium();
                        int perihelium = showPlanet.getPerihelium();

                        Mane[] showPlanetMoons = showPlanet.showManar();

                        System.out.println("Planetnamn: " + namn);
                        System.out.println("Plats från solen: " + plats);
                        System.out.println("Antal månar: " + antalMonar);
                        for (int j = 0; j < showPlanetMoons.length; j++) {
                            if (showPlanetMoons[j] == null) {
                                break;
                            } else {
                                System.out.println("Måne " + (j + 1) + ": " + showPlanetMoons[j].getNamn() + "(" + showPlanetMoons[j].getDiameter() + ")");
                            }
                        }
                        System.out.println("Aphelium: " + aphelium);
                        System.out.println("Perihelium: " + perihelium + "\n");
                    }
                } else {
                    System.out.println("Finns inte några planeter inlagda!");
                }
            } else if (val == 2) {
                System.out.print("Vad heter planeten? ");
                String namn = scan.next();


                System.out.print("Vilken plats från solen? ");
                int plats = scan.nextInt();

                System.out.print("Hur många månar? ");
                int monar = scan.nextInt();


                Mane[] monArray = new Mane[monar];
                if (monar > 0) {
                    System.out.print("Vill du skriva in månar? (J/N)? ");
                    String jaEllerNej = scan.next();
                    if (jaEllerNej.equals("j")) {
                        boolean skrivManar = true;
                        int counter = 0;
                        System.out.println("Skriv in månar, avsluta med att skriva \"stopp\" ");
                        do {

                            System.out.println("Ange namn på måne: ");
                            String monNamn = scan.next();
                            if (monNamn.equalsIgnoreCase("stopp")) {
                                skrivManar = false;
                            } else {
                                System.out.println("Ange diametern i km: ");
                                int diameter = scan.nextInt();

                                Mane maneSaker = new Mane(monNamn, diameter);
                                monArray[counter] = maneSaker;
                                counter++;
                            }
                        } while (skrivManar && counter < monar);

                    }
                }


                System.out.print("Ange aphelium: ");
                int aphelium = scan.nextInt();

                System.out.print("Ange perihelium: ");
                int perihelium = scan.nextInt();

                PlanetMedManobjekt planet = new PlanetMedManobjekt(namn, plats, monar, aphelium, perihelium);
                planeter[noOfPlanets] = planet;

                for (int i = 0; i < monar; i++) {
                    Mane nuvarandeMane = monArray[i];
                    planet.addMane(nuvarandeMane);
                }
                noOfPlanets++;

            }else if (val == 3) {
                System.out.println("Programmet avslutas -- Ciao!");

            }
            }while (go);
        }
    }