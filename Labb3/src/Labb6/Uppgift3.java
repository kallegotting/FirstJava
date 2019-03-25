package Labb6;

public class Uppgift3 {
    public static void main(String[] args) {
        PlanetMedManobjekt planetEtt = new PlanetMedManobjekt("Saturnus", 6, 200, 1513325783, 1353572956);
        Mane mane1 = new Mane("Titan", 5152);
        Mane mane2 = new Mane("Rhea", 4276);
        Mane mane3 = new Mane("Enceladus", 516);

        PlanetMedManobjekt planetTvo = new PlanetMedManobjekt("Jupiter", 5, 12, 816520800, 740573600);
        Mane mane4 = new Mane("Io", 3643);
        Mane mane5 = new Mane("Europa", 3122);
        Mane mane6 = new Mane("Ganymedes", 5262);
        Mane mane7 = new Mane("Callisto", 4821);

        planetEtt.addMane(mane1);
        planetEtt.addMane(mane2);
        planetEtt.addMane(mane3);

        planetTvo.addMane(mane4);
        planetTvo.addMane(mane5);
        planetTvo.addMane(mane6);
        planetTvo.addMane(mane7);

        System.out.println("Planeten heter " + planetEtt.getNamn() + " och har följande månar: \n");
        int i = 1;
        for (Mane m: planetEtt.showManar()) {
            System.out.println("Måne " + i + " heter " + m.getNamn() + " (" +  m.getDiameter() + "km)");
        }

        System.out.println("Planeten heter " + planetTvo.getNamn() + " och har följande månar: \n");
        int j = 1;
        for (Mane n: planetTvo.showManar()) {
            System.out.println("Måne " + i + " heter " + n.getNamn() + " (" + n.getDiameter() + "km)");
        }


    }
}

