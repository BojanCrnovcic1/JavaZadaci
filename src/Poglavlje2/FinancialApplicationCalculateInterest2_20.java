package Poglavlje2;

import java.util.Scanner;

public class FinancialApplicationCalculateInterest2_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite stanje i godisnju kamatnu stopu : ");
        double stanje = input.nextDouble();
        double godisnjaKamtnaStopa = input.nextDouble();

        double kamata = stanje * (godisnjaKamtnaStopa / 1200);

        System.out.println("Kamata je : " + kamata);
    }
}
