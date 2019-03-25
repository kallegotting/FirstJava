package Labb7;

public class Fagel extends Djur{
    private boolean arFlyttfagel;
    private boolean kanFlyga;
    private String redestyp;

    public Fagel(){
    }

    public Fagel(String namn, String latisktNamn, double vikt, String late, boolean arFlyttfagel, boolean kanFlyga, String redestyp) {
        super(namn, latisktNamn, vikt, late);
        this.arFlyttfagel = arFlyttfagel;
        this.kanFlyga = kanFlyga;
        this.redestyp = redestyp;
    }

    public boolean isArFlyttfagel() {
        return arFlyttfagel;
    }

    public void setArFlyttfagel(boolean arFlygfagel) {
        this.arFlyttfagel = arFlygfagel;
    }

    public boolean isKanFlyga() {
        return kanFlyga;
    }

    public void setKanFlyga(boolean kanFlyga) {
        this.kanFlyga = kanFlyga;
    }

    public String getRedestyp() {
        return redestyp;
    }

    public void setRedestyp(String redestyp) {
        this.redestyp = redestyp;
    }

    @Override
    public String toString() {
        return this.getNamn() + " (" + this.getLatisktNamn() + ") och väger ungefär " + this.getVikt() + " kg och är " + this.isArFlyttfagel() + " och " + this.isKanFlyga() + " och har sitt bo i " + this.getRedestyp() + " Den låter: " + this.ljud();
    }
}
