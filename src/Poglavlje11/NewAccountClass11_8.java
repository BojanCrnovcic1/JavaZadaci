package Poglavlje11;

import Klase.Account1;

public class NewAccountClass11_8 {
    public static void main(String[] args) {

        Account1 acc = new Account1("George",1122,1000);

        acc.setGodisnjaKamatnaStopa(1.5);

        acc.depozit(30);
        acc.depozit(40);
        acc.depozit(50);

        acc.povlacenje(5);
        acc.povlacenje(4);
        acc.povlacenje(2);

        System.out.println(acc.toString());

    }
}
