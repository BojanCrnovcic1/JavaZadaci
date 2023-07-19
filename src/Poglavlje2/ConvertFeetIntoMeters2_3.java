package Poglavlje2;

import java.util.Scanner;

public class ConvertFeetIntoMeters2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite vrijednost stope : ");
        double feet = input.nextDouble();

        double meters = feet * 0.305;

        System.out.println(feet + " stopa je " + meters + " metara. ");

    }
}
