package Poglavlje9;

import Klase.Stock;

public class TheStockClass9_2 {
    public static void main(String[] args) {

        Stock akcija = new Stock("ORCL","Oracle Corporation",34.5,34.35);

        System.out.println("Simbol : " + akcija.getSimbol() + "" +
                "\nNaziv : " + akcija.getIme() +"" +
                "\nBivsa cijena : " + akcija.getBivsaCijena() + "$" + "" +
                "\nSadasnja cijena : " + akcija.getSadasnjaCijena() + "$" + "" +
                "\nProcenat promijene cijene : " + akcija.getChangePercent() + "%");
    }
}
