package Poglavlje11;

import Klase.Account;
import Klase.CheckingAccount;
import Klase.SavingsAccount;

public class SubclassesOfAccount11_3 {
    public static void main(String[] args) {

        Account[] accounts = new Account[3];

        accounts[0] = new Account(1222,3000);
        accounts[1] = new CheckingAccount(1223,3000,-50);
        accounts[2] = new SavingsAccount(1224,3000);

        accounts[1].povlacenje(3000);
        accounts[2].povlacenje(5000);


        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
