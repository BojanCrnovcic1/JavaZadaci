package Poglavlje2;

import java.util.Scanner;

public class ConvertPoundsIntoKilograms2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj funti : ");
        double pounds = input.nextDouble();

        double kilograms = pounds * 0.454;

        System.out.println(pounds + " funti je " + kilograms + " kilograma. ");
    }

}
