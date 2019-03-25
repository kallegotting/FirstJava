package Labb6;


import java.util.Arrays;

public class PlanetMedManobjekt {
    private String namn;
    private int plats;
    private int manar;
    private int aphelium;
    private int perihelium;
    private int tillagdmane;
    private Mane [] monLista = new Mane[200];

    public PlanetMedManobjekt() {

    }

    public PlanetMedManobjekt(String n, int pl, int m, int a, int p) {
        namn = n;
        setPlats(pl);
        setManar(m);
        setAphelium(a);
        setPerihelium(p);
        tillagdmane = 0;
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


    public void addMane(Mane newMane){
        if (tillagdmane < 200) {
            monLista[tillagdmane] = newMane;
            tillagdmane++;
        }
    }

    public Mane[] showManar() {
        return Arrays.copyOfRange(monLista, 0, tillagdmane);
    }

}
