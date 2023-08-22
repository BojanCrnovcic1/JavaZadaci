package Klase;

import java.util.Date;

public class Transaction {
    private Date date;
    private char type;
    private double iznos;
    private double balance;
    private String decription;

    public Transaction(char type, double iznos, double balance, String decription) {
        date = new Date();
        this.type = type;
        this.iznos = iznos;
        this.balance = balance;
        this.decription = decription;
    }

    public String getDate() {
        return date.toString();
    }

    public void setDate() {
        date = new Date();
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    @Override
    public String toString() {
        return "Vrijeme : " + getDate().toString() +
                "\nTip : " + type +
                "\nIznos : " + iznos +
                "\nBalance : " + balance +
                "\nOpis : " + decription;
    }
}
