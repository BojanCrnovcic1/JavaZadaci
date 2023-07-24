package Poglavlje5;

import java.util.Scanner;

public class FinancialApplicationComputeCDValue5_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite pocetni iznos depozita : ");
        double depozit = input.nextDouble();
        System.out.println("Unesite godisnji procenatalni rast : ");
        double godisnjiProcentalniRast = input.nextDouble();
        double mjesecniProcenat = godisnjiProcentalniRast / 1200;
        System.out.println("Unesite broj mjeseci : ");
        int mjesec = input.nextInt();

        System.out.println("Mjesec\t\t\tCD vrijednost");
        for (int i = 1; i <= mjesec; i++) {

            depozit += depozit * mjesecniProcenat;

            System.out.println(i+"\t\t\t\t"+depozit);
        }
    }
}
