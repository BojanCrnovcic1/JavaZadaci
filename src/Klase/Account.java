package Klase;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double godisnjaKamatnaStopa;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        godisnjaKamatnaStopa = 0;
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setGodisnjaKamatnaStopa(double godisnjaKamatnaStopa) {
        this.godisnjaKamatnaStopa = godisnjaKamatnaStopa;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getGodisnjaKamatnaStopa() {
        return godisnjaKamatnaStopa;
    }

    public double getMijesecnaKamatnaStopa() {
        return getGodisnjaKamatnaStopa() / 12;
    }

    public double getMjesecnoPlacanje() {
        return balance * (getMijesecnaKamatnaStopa() / 100);
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public void povlacenje(double iznos) {
        balance -= iznos;
    }

    public void depozit(double iznos) {
        balance += iznos;
    }

    @Override
    public String toString() {
        return "Id : " + id +
                "\nBalance : " + balance +
                "\nGodisnja kamatna stopa : " + godisnjaKamatnaStopa +
                "\nVrijeme kreiranja racuna : " + getDateCreated().toString();
    }
}


