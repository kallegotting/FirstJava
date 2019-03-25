package Labb7;

public class Reptil extends Djur {
    private String levnadsmiljo;
    private boolean giftig;

    public Reptil(){
    }

    public Reptil(String namn, String latisktNamn, double vikt, String late, String levnadsmiljo, boolean giftig) {
        super(namn, latisktNamn, vikt, late);
        this.levnadsmiljo = levnadsmiljo;
        this.giftig = giftig;
    }

    public String getLevnadsmiljo() {
        return levnadsmiljo;
    }

    public void setLevnadsmiljo(String levnadsmiljo) {
        this.levnadsmiljo = levnadsmiljo;
    }

    public boolean isGiftig() {
        return giftig;
    }

    public void setGiftig(boolean giftig) {
        this.giftig = giftig;
    }

    @Override
    public String toString() {
        return this.getNamn() + " (" + this.getLatisktNamn() + ") och väger ungefär " + this.getVikt() + " kg och bor i " + this.getLevnadsmiljo() + " samt är " + this.isGiftig() + "." + " Den låter: " + this.ljud();
    }

}
