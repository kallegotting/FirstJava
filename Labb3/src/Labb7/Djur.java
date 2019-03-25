package Labb7;

public abstract class Djur implements Comparable<Djur> {
    private String namn;
    private String latisktNamn;
    private double vikt;
    private String late;

    public Djur(){
    }

    public Djur(String namn, String latisktNamn, double vikt, String late) {
        this.namn = namn;
        this.latisktNamn = latisktNamn;
        this.vikt = vikt;
        this.late = late;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getLatisktNamn() {
        return latisktNamn;
    }

    public void setLatisktNamn(String latisktNamn) {
        this.latisktNamn = latisktNamn;
    }

    public double getVikt() {
        return vikt;
    }

    public void setVikt(double vikt) {
        this.vikt = vikt;
    }

    @Override
    public int compareTo(Djur o) {
        return (this.latisktNamn.compareTo(o.latisktNamn));
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String ljud() {
        return late;
    }
}
