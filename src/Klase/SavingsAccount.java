package Klase;

public class SavingsAccount extends Account {
    public SavingsAccount() {

    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    public void povlacenje(double iznos) {
        if (iznos < getBalance()) {
            setBalance(getBalance() - iznos);
        }
        else
            System.out.println("Transakcija nije izvrena. Nema dovoljno sredstava na racunu. ");
    }
}
