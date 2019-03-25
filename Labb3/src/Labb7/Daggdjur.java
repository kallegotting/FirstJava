package Labb7;

public class Daggdjur extends Djur {
    private String palsfarg;
    private boolean harVinterpals;

    public Daggdjur(){
    }

    public Daggdjur(String namn, String latisktNamn, double vikt, String late, String palsfarg, boolean harVinterpals) {
        super(namn, latisktNamn, vikt, late);
        this.palsfarg = palsfarg;
        this.harVinterpals = harVinterpals;
    }

    public String getPalsfarg() {
        return palsfarg;
    }

    public void setPalsfarg(String palsfarg) {
        this.palsfarg = palsfarg;
    }

    public boolean isHarVinterpals() {
        return harVinterpals;
    }

    public void setHarVinterpals(boolean harVinterpals) {
        this.harVinterpals = harVinterpals;
    }

    @Override
    public String toString() {
        return this.getNamn() + " (" + this.getLatisktNamn() + ") och väger ungefär " + this.getVikt() + " kg och bor i " + this.getPalsfarg() + " samt har " + this.isHarVinterpals() + "." + " Den låter: " + this.ljud();
    }


}
