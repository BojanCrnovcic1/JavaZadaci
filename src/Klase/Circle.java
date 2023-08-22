package Klase;

public class Circle {
    private double radius;
    private int brojKrugova;

    public Circle() {
        radius = 1;
        brojKrugova++;
    }

    public Circle(double radius) {
        this.radius = radius;
        brojKrugova++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getBrojKrugova() {
        return brojKrugova;
    }

    public void setBrojKrugova(int brojKrugova) {
        this.brojKrugova = brojKrugova;
    }

    @Override
    public String toString() {
        return "\nRadius : " + radius +
                "\nBroj krugova : " + brojKrugova;
    }
}
