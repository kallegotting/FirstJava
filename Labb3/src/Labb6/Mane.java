package Labb6;

public class Mane {
    private String namn;
    private int diameter;

    public Mane() {

    }

    public Mane(String namn, int diameter) {
        this.namn = namn;
        this.diameter = diameter;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
