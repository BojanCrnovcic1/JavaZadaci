package Poglavlje2;

import java.util.Scanner;

public class ScienceCalculatingEnergy2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite iznos vode u kilogramima : ");
        double M = input.nextDouble();
        System.out.println("Unesite pocetnu temperaturu : ");
        double initialTemperature = input.nextDouble();
        System.out.println("Unesite konacnu temperaturu : ");
        double finalTemperature = input.nextDouble();

       double Q = M * (finalTemperature - initialTemperature) * 4184;

        System.out.println("Potrebna energija je : " + Q);
    }
}
