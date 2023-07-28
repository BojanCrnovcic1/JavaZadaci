package Poglavlje9;

import Klase.Account;

public class TheAccountClass9_7 {
    public static void main(String[] args) {

        Account acc = new Account(1122,20000);
        acc.setGodisnjaKamatnaStopa(4.5);
        acc.povlacenje(2500);
        acc.depozit(3000);

        System.out.println("Balance : " + acc.getBalance() + "" +
                "\nMjesecno placanje : " + acc.getMjesecnoPlacanje() + "" +
                "\nVrijeme kreiranja racuna : " + acc.getDateCreated());
    }
}
