package Klase;

public class Staff extends Employee {
    private String title;

    public Staff() {

    }

    public Staff(String ime, String adresa, String telefonskiBroj, String emailAdresa,
                 int office, double plata, String title) {
        super(ime, adresa, telefonskiBroj, emailAdresa, office, plata);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTitula : " + title;
    }
}
