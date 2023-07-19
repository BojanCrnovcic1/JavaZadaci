package Poglavlje2;

import java.util.Scanner;

public class FinancialApplicationMonetaryUnits2_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite iznos u integeru :");
        int iznos = input.nextInt();

        int ostakatIznosa = iznos;

        int dolar = ostakatIznosa / 100;
        ostakatIznosa %= 100;

        int cetvrtina = ostakatIznosa / 25;
        ostakatIznosa %= 25;

        int dimas = ostakatIznosa / 10;
        ostakatIznosa %= 10;

        int nickles = ostakatIznosa / 5;
        ostakatIznosa %= 5;

        int brojPenija = ostakatIznosa;

        System.out.println("Vas iznos " + iznos / 100 + " sadrzi : ");
        System.out.println("Broj dolara : " + dolar);
        System.out.println("Broj cetvrtina : " + cetvrtina);
        System.out.println("Broj dima : " + dimas);
        System.out.println("Broj nickles : " + nickles);
        System.out.println("Broj penija : " + brojPenija);
    }
}
