package Labb6;

import java.util.Arrays;

public class PlanetM {
    private String namn;
    private int plats;
    private int manar;
    private int aphelium;
    private int perihelium;
    private int tillagdmane;
    private String[] monNamn = new String[200];

    public PlanetM() {
    }

    public PlanetM(String n, int pl, int m, int a, int p) {
        namn = n;
        setPlats(pl);
        setManar(m);
        setAphelium(a);
        setPerihelium(p);
        tillagdmane = 0;
    }


    public void addMane(String mN){
        do {monNamn[tillagdmane] = mN;
            tillagdmane ++;
        }while(tillagdmane < 1);
    }


    public String[] showManar() {
        return Arrays.copyOfRange(monNamn, 0, tillagdmane);
    }




    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getPlats() {
        return plats;
    }

    public void setPlats(int plats) {
        this.plats = plats;
    }

    public int getManar() {
        return manar;
    }

    public void setManar(int manar) {
        this.manar = manar;
    }

    public int getAphelium() {
        return aphelium;
    }

    public void setAphelium(int aphelium) {
        this.aphelium = aphelium;
    }

    public int getPerihelium() {
        return perihelium;
    }

    public void setPerihelium(int perihelium) {
        this.perihelium = perihelium;
    }

    public int getTillagdmane() {
        return tillagdmane;
    }

    public void setTillagdmane(int tillagdmane) {
        this.tillagdmane = tillagdmane;
    }

    public String[] getMonNamn() {
        return monNamn;
    }

    public void setMonNamn(String[] monNamn) {
        this.monNamn = monNamn;
    }


}


