package Klase;

public class Stock {
    private String simbol;
    private String ime;
    private double bivsaCijena;
    private double sadasnjaCijena;

    public Stock() {

    }

    public Stock(String simbol, String ime, double bivsaCijena, double sadasnjaCijena) {
        this.simbol = simbol;
        this.ime = ime;
        this.bivsaCijena = bivsaCijena;
        this.sadasnjaCijena = sadasnjaCijena;
    }

    public String getSimbol() {
        return simbol;
    }

    public String getIme() {
        return ime;
    }

    public double getBivsaCijena() {
        return bivsaCijena;
    }

    public double getSadasnjaCijena() {
        return sadasnjaCijena;
    }

    public double getChangePercent() {
        return ((sadasnjaCijena - bivsaCijena) / bivsaCijena) * 100;
    }
}
