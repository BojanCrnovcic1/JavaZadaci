package Klase;

public class Person {
    private String ime;
    private String adresa;
    private String telefonskiBroj;
    private String emailAdresa;

    public Person() {

    }

    public Person(String ime, String adresa, String telefonskiBroj, String emailAdresa) {
        this.ime = ime;
        this.adresa = adresa;
        this.telefonskiBroj = telefonskiBroj;
        this.emailAdresa = emailAdresa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTelefonskiBroj() {
        return telefonskiBroj;
    }

    public void setTelefonskiBroj(String telefonskiBroj) {
        this.telefonskiBroj = telefonskiBroj;
    }

    public String getEmailAdresa() {
        return emailAdresa;
    }

    public void setEmailAdresa(String emailAdresa) {
        this.emailAdresa = emailAdresa;
    }

    @Override
    public String toString() {
        return "Ime : " + ime +
                "\nAdresa : " + adresa +
                "\nBroj telefona : " + telefonskiBroj +
                "\nEmail adresa : " + emailAdresa;
    }
}
