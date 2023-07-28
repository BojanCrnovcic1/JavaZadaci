package Klase;

public class Rectangle {
    public double sirina;
    public double visina;

    public Rectangle() {
        sirina = 1;
        visina = 1;
    }

    public Rectangle(double sirina, double visina) {
        this.sirina = sirina;
        this.visina = visina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public double getSirina() {
        return sirina;
    }

    public double getVisina() {
        return visina;
    }

    public double getArea() {
        return visina * sirina;
    }

    public double getPerimeter() {
        return 2 * (visina + sirina);
    }
}
