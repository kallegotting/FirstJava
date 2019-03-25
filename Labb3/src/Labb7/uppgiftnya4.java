
package Labb7;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

    public class uppgiftnya4 {
        public static void main(String[] args) {
            ArrayList<Labb7.Djur> djurTyp = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            Scanner scan1 = new Scanner(System.in);
            int val = 0;
            boolean kor = true;
            //valen som kommer ske vid inläggning av djuren
            String djurVal;
            int indexRaknare = 0;

            importAvFil(djurTyp);


            do {
                System.out.println();
                System.out.println("Djurmeny");
                System.out.println("========\n");
                System.out.println("1. Visa djur i ordning");
                System.out.println("2. Lägg till ett djur");
                System.out.println("3. Avsluta\n");
                System.out.print("==> ");
                val = scan.nextInt();


                //Val 1
                if (val == 1) {
                    Collections.sort(djurTyp);
                    for (Labb7.Djur d : djurTyp) {
                        System.out.println(d.toString());
                        //System.out.println(d.getNamn() + "(" + d.getLatisktNamn() + ") " + "väger omkring " + d.getVikt() + " " + d.getSpeciel() + " och låter: " + d.ljud()); //gör en mf toString
                    }
                }


                //Val 2
                if (val == 2) {
                    Boolean valjDjur = true;
                    String djurNamn;
                    String djurLatinsktNamn;
                    double djurVikt;
                    String djurLate;

                    while (valjDjur) {
                        System.out.println("Vilket slags djur vill du skapa? \n");
                        System.out.println("1. Däggdjur");
                        System.out.println("2. Fågel");
                        System.out.println("3. Reptil\n");
                        System.out.print("==> ");
                        val = scan.nextInt();

                        //Däggdjur
                        if (val == 1) {
                            String daggdjurPals;
                            boolean vinterpals;

                            System.out.print("Ange namn: ");
                            djurNamn = scan1.nextLine();
                            System.out.print("Ange latinskt namn: ");
                            djurLatinsktNamn = scan1.nextLine();
                            System.out.print("Ange vikt: ");
                            djurVikt = scan.nextDouble();
                            System.out.print("Ange pälsfärg: ");
                            daggdjurPals = scan1.nextLine();
                            System.out.print("Har den vinterpäls? (J/N) ");
                            djurVal = scan1.nextLine();
                            if (djurVal.equalsIgnoreCase("j")) {
                                vinterpals = true;
                            } else {
                                vinterpals = false;
                            }
                            System.out.print("Hur låter den? ");
                            djurLate = scan1.nextLine();
                            djurTyp.add(new Labb7.Daggdjur(djurNamn, djurLatinsktNamn, djurVikt, djurLate, daggdjurPals, vinterpals));


                            indexRaknare++;
                            valjDjur = false;
                        }
                        //Fågel
                        else if (val == 2) {
                            boolean flyttfagel;
                            boolean flyger;
                            String redet;

                            System.out.print("Ange namn:");
                            djurNamn = scan1.nextLine();
                            System.out.print("Ange latinskt namn: ");
                            djurLatinsktNamn = scan1.nextLine();
                            System.out.print("Ange vikt: ");
                            djurVikt = scan.nextDouble();
                            System.out.print("Är det en flyttfågel? (J/N) ");
                            djurVal = scan1.nextLine();
                            if (djurVal.equalsIgnoreCase("j")) {
                                flyttfagel = true;
                            } else {
                                flyttfagel = false;
                            }
                            System.out.print("Kan den flyga? (J/N) ");
                            djurVal = scan1.nextLine();
                            if (djurVal.equalsIgnoreCase("j")) {
                                flyger = true;
                            } else {
                                flyger = false;
                            }
                            System.out.print("Beskriv redet: ");
                            redet = scan1.nextLine();
                            System.out.print("Hur låter den? ");
                            djurLate = scan1.nextLine();
                            djurTyp.add(new Labb7.Fagel(djurNamn, djurLatinsktNamn, djurVikt,  djurLate, flyttfagel, flyger, redet));
                            indexRaknare++;
                            valjDjur = false;
                        }
                        //Reptil
                        else if (val == 3) {
                            String levnadsmiljo;
                            boolean giftig;

                            System.out.print("Ange namn: ");
                            djurNamn = scan1.nextLine();
                            System.out.print("Ange latinskt namn: ");
                            djurLatinsktNamn = scan1.nextLine();
                            System.out.print("Ange vikt: ");
                            djurVikt = scan.nextDouble();
                            System.out.print("Beskriv levnadsmiljön: ");
                            levnadsmiljo = scan1.nextLine();
                            System.out.print("Är den giftig? (J/N) ");
                            djurVal = scan1.nextLine();
                            if (djurVal.equalsIgnoreCase("j")) {
                                giftig = true;
                            } else {
                                giftig = false;
                            }
                            System.out.print("Hur låter den? ");
                            djurLate = scan1.nextLine();

                            djurTyp.add(new Labb7.Reptil(djurNamn, djurLatinsktNamn, djurVikt, djurLate, levnadsmiljo, giftig));
                            indexRaknare++;
                            valjDjur = false;

                        }
                    }
                }
                //val 3
                else if (val == 3) {
                    exportAvFil(djurTyp);
                    System.out.println("Hej då!");
                    kor = false;
                }
            } while (kor);
        }

        //import metod
        public static void importAvFil(ArrayList<Labb7.Djur> importDjur) {
            File filen = new File("DjurWiki.txt");
            if (filen.exists())
                try {
                    Scanner lasInFil = new Scanner(filen).useDelimiter(",");
                    while (lasInFil.hasNext()) {
                        String djurID = lasInFil.next();
                        if (djurID.equalsIgnoreCase("f")) {
                            String namn = lasInFil.next();
                            String latinsktNamn = lasInFil.next();
                            double vikt = Double.parseDouble(lasInFil.next());
                            String arFlyttFagel = lasInFil.next();
                            boolean flyttFagel = true;
                            if (arFlyttFagel.equalsIgnoreCase("false")) {
                                flyttFagel = false;
                            }
                            String flyger = lasInFil.next();
                            boolean kanFlyga = true;
                            if (flyger.equalsIgnoreCase("false")) {
                                kanFlyga = false;
                            }
                            String redesTyp = lasInFil.next();
                            String late = lasInFil.nextLine();
                            if (late.startsWith(",")){
                                late = late.substring(1);
                            }
                            //late = late.startsWith(",") ? late.substring(1) : late;
                            Labb7.Fagel fagel = new Labb7.Fagel(namn, latinsktNamn, vikt, late, flyttFagel, kanFlyga, redesTyp);
                            importDjur.add(fagel);
                        } else if (djurID.equalsIgnoreCase("d")) {
                            String namn = lasInFil.next();
                            String latinsktNamn = lasInFil.next();
                            double vikt = Double.parseDouble(lasInFil.next());
                            String palsFarg = lasInFil.next();
                            String harVinterPals = lasInFil.next();
                            boolean vinterPals = true;
                            if (harVinterPals.equalsIgnoreCase("false")) {
                                vinterPals = false;
                            }
                            String late = lasInFil.nextLine();
                            late = late.startsWith(",") ? late.substring(1) : late;
                            Labb7.Daggdjur daggdjur = new Labb7.Daggdjur(namn, latinsktNamn, vikt, late, palsFarg, vinterPals);
                            importDjur.add(daggdjur);
                        } else {
                            String namn = lasInFil.next();
                            String latinsktNamn = lasInFil.next();
                            double vikt = Double.parseDouble(lasInFil.next());
                            String levnadsMiljo = lasInFil.next();
                            String arGiftig = lasInFil.next();
                            boolean giftig = true;
                            if (arGiftig.equalsIgnoreCase("false")) {
                                giftig = false;
                            }
                            String late = lasInFil.nextLine();
                            if (late.startsWith(",")){
                                late = late.substring(1);
                            }
                            //late = late.startsWith(",") ? late.substring(1) : late;
                            Labb7.Reptil reptil = new Labb7.Reptil(namn, latinsktNamn, vikt, late, levnadsMiljo, giftig);
                            importDjur.add(reptil);
                        }
                    }
                } catch (IOException E) {
                    System.out.println("Error");
                }
            else {
                System.out.println("Filen existerar inte!");
            }
        }


        //export
        public static void exportAvFil(ArrayList<Labb7.Djur> exportDjur) {
            try {
                PrintWriter pw = new PrintWriter("DjurWiki.txt");
                for (int i = 0; i < exportDjur.size(); i++) {
                    Labb7.Djur djur = exportDjur.get(i);
                    String inSkriv = "";
                    if (djur instanceof Labb7.Fagel) {
                        inSkriv += "f," + djur.getNamn() + "," + djur.getLatisktNamn() + "," + djur.getVikt() + "," + ((Labb7.Fagel) djur).isArFlyttfagel() + "," + ((Labb7.Fagel) djur).isKanFlyga() + "," + ((Labb7.Fagel) djur).getRedestyp() + "," + djur.ljud();
                    } else if (djur instanceof Labb7.Daggdjur) {
                        inSkriv += "d," + djur.getNamn() + "," + djur.getLatisktNamn() + "," + djur.getVikt() + "," + ((Labb7.Daggdjur) djur).getPalsfarg() + "," + ((Labb7.Daggdjur) djur).isHarVinterpals() + "," + djur.ljud();
                    } else if (djur instanceof Labb7.Reptil) {
                        inSkriv += "r," + djur.getNamn() + "," + djur.getLatisktNamn() + "," + djur.getVikt() + "," + ((Labb7.Reptil) djur).getLevnadsmiljo() + "," + ((Labb7.Reptil) djur).isGiftig() + "," + djur.ljud();
                    }
                    pw.println(inSkriv);
                }
                pw.close();
            } catch (Exception E) {
                System.out.println("Mayday abort mission");
            }

            //skapa metod export

        }
    }

