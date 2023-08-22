package Poglavlje10;

import Klase.Account;

import java.util.Scanner;

public class GameATM_Machine10_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account[] accounts = new Account[10];

        inicijalniBalance(accounts);

        do {
            System.out.println("Unesite ID: ");
            int id = input.nextInt();

            if (isValid(id,accounts)) {
                int izborUnosa;
                do {
                    izborUnosa = MainMenu(input);
                    if(transakcija(izborUnosa)) {
                        izvrsiTransakciju(izborUnosa,accounts,id,input);
                    }
                }while (izborUnosa != 4);
            }

        }while (true);

    }
    public static void inicijalniBalance(Account[] accounts) {
        double inicijalniBalance = 100;
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i,inicijalniBalance);
        }
    }

    public static boolean isValid(int id, Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static int MainMenu(Scanner input) {
        System.out.println("Main Menu : \n1 : Provera balansa \n2: Povlacenje \n3: Depozit \n4: Exit" +
                "\nIzaberite unos : ");
        return input.nextInt();
    }

    public static boolean transakcija(int unos) {
        return unos > 0 && unos < 4;
    }

    public static void izvrsiTransakciju(int c, Account[] accounts, int id, Scanner input) {
        switch (c) {
            case 1: {
                System.out.println("Balance na racunu je " + accounts[id].getBalance());
            }break;
            case 2: {
                System.out.println("Unesite iznos za povuci : ");
                accounts[id].povlacenje(input.nextDouble());
            }break;
            case 3: {
                System.out.println("Unesite iznos za dodati na racun : ");
                accounts[id].depozit(input.nextDouble());
            }
        }
    }
}
