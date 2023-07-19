package Poglavlje2;

import java.util.Scanner;

public class HealthApplicationComputingBMI2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double FUNTE_U_KILOGRAMIMA = 0.45359237;
        final double INCI_U_METRIMA = 0.0254;

        System.out.println("Unesite tezinu u funtama : ");
        double funte = input.nextDouble();
        System.out.println("Unesite visinu u incima : ");
        double inci = input.nextDouble();

        double bmi = (funte * FUNTE_U_KILOGRAMIMA) / ((inci * INCI_U_METRIMA) * (inci * INCI_U_METRIMA));

        System.out.println("BMI je : " + bmi);
    }
}
