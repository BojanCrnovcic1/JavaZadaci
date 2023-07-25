package Poglavlje6;

import java.util.Scanner;

public class CheckPassword6_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite lozinku : ");
        String lozinka = input.next();

        ispisPassworda(lozinka);
    }


    public static void ispisPassworda(String password) {
        if (validPassword(password)) {
            System.out.println(password + " je validan. ");
        }
        else
            System.out.println(password + " nije validan. ");
    }

    public static boolean validPassword(String password) {
        final int DUZINA_LOZINKE = 8;
        final int BROJ_BROJEVA = 2;

        boolean isValid = (duzinaLozinke(password,DUZINA_LOZINKE) && slovaIBrojevi(password)
        && brojBrojevs(password,BROJ_BROJEVA));
        return isValid;
    }

    public static boolean duzinaLozinke(String password, int duzina) {
        return password.length() >= duzina;
    }

    public static boolean slovaIBrojevi(String password) {
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static boolean brojBrojevs(String password, int brojBrojeva) {
        int countNumb = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                countNumb++;
            }
            if (countNumb >= brojBrojeva) {
                return true;
            }
        }
        return false;
    }
}
