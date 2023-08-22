package Klase;

import java.util.ArrayList;
import java.util.Date;

public class Account1 {
    private String ime;
    private int id;
    private double balance;
    private double godisnjaKamatnaStopa;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    public Account1() {
        ime = "";
        id = 0;
        balance = 0;
        godisnjaKamatnaStopa = 0;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public Account1(String ime, int id, double balance) {
        this.ime = ime;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getGodisnjaKamatnaStopa() {
        return godisnjaKamatnaStopa;
    }

    public double getMjesecnaKamatnaStopa() {
        return getGodisnjaKamatnaStopa() / 12;
    }

    public double getMjesecnaKamata() {
        return balance * (getMjesecnaKamatnaStopa() / 100);
    }

    public void setGodisnjaKamatnaStopa(double godisnjaKamatnaStopa) {
        this.godisnjaKamatnaStopa = godisnjaKamatnaStopa;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void povlacenje(double iznos) {
        balance -= iznos;
        transactions.add(new Transaction('P',iznos,balance,"Povlacenje novca sa racuna."));
    }

    public void depozit(double iznos) {
        balance += iznos;
        transactions.add(new Transaction('D',iznos,balance,"Depozitovanje novca na racun. "));
    }

    @Override
    public String toString() {
        return "Ime : " + ime +
                "\nId : " + id +
                "\nBalance : " + balance +
                "\nGodisnja kamatna stopa : " + godisnjaKamatnaStopa +
                "\nVrijeme kreiranja : " + getDateCreated().toString() +
                "\nTransakcija : " + transactions;
    }
}
