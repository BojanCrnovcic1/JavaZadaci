package Poglavlje2;

import java.util.Scanner;

public class SumTheDigitsInAnInteger2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj izmedju 0 - 1000 : ");
        int broj = input.nextInt();

        int zadnjiBroj = broj % 10;
        int ostatak = broj / 10;
        int prednjiBroj = ostatak / 10;
        int srednjiBroj = ostatak % 10;

        System.out.println("Zbir cifara je : " + (prednjiBroj + srednjiBroj + zadnjiBroj));
    }
}
