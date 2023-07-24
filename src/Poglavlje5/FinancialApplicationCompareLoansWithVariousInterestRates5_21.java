package Poglavlje5;

import java.util.Scanner;

public class FinancialApplicationCompareLoansWithVariousInterestRates5_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite iznos pozajmice : ");
        double iznosPozajmice = input.nextDouble();
        System.out.println("Unesite broj godina : ");
        int brojGodina = input.nextInt();

        System.out.println("Kamatna stopa\t\t\tMjesecno placanje\t\t\tTotal placanje");

        for (double i = 5.000; i <= 8.000; i += 0.125) {
            double mjesecnaKamatnaStopa = i / 1200;

            double mjesecnoPolacanje = iznosPozajmice * mjesecnaKamatnaStopa / (1
                    - 1 / Math.pow(1 + mjesecnaKamatnaStopa, brojGodina * 12));
            double totalPlacanje = (mjesecnoPolacanje * 12) * brojGodina;

            System.out.println(i+"\t\t\t"+mjesecnoPolacanje+"\t\t\t"+totalPlacanje);
        }
    }
}
