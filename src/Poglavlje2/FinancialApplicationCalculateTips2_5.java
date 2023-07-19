package Poglavlje2;

import java.util.Scanner;

public class FinancialApplicationCalculateTips2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite iznos racuna i procenat napojnice : ");
        double iznosRacuna = input.nextDouble();
        double procenatNapojnice = input.nextDouble() / 100;

        double napojnica = iznosRacuna * procenatNapojnice;
        double total = iznosRacuna + napojnica;

        System.out.println("Napojnica je $" + napojnica + " a cijeli racun $" + total);
    }
}
