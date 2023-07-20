package Poglavlje3;

import java.util.Scanner;

public class FinancialCompareCosts3_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite tezinu u cijenu prvog paketa : ");
        double tezina1 = input.nextDouble();
        double cijena1 = input.nextDouble();
        System.out.println("Unesite tezinu i cijenu drugog paketa : ");
        double tezina2 = input.nextDouble();
        double cijena2 = input.nextDouble();

        double paket1 = (tezina1 / cijena1);
        double paket2 = (tezina2 / cijena2);

        if (paket1 > paket2) {
            System.out.println("Drugi paket ima vecu vrijednost. ");
        }
        else if (paket1 < paket2) {
            System.out.println("Prvi paket ima vecu vrijednost. ");
        }
        else
            System.out.println("Oba paketa imaju istu vrijednost. ");

    }
}
