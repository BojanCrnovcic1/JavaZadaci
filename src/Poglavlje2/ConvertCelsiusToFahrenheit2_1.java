package Poglavlje2;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheit2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite temperaturu u Celsijusima : ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println(celsius + " celsius ima " + fahrenheit + " fahrenheita.");
    }
}
