package Poglavlje6;

import java.util.Scanner;

public class DisplayCharacters6_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite pocetni karakter : ");
        String karakter = input.next();
        char kar = karakter.charAt(0);
        System.out.println("Unesite zadnji karakter : ");
        String karakter1 = input.next();
        char kar1 = karakter1.charAt(0);
        System.out.println("Unesite broj po liniji : ");
        int brojPoLiniji = input.nextInt();

        printChars(kar,kar1,brojPoLiniji);
    }
    public static void printChars(char ch1, char ch2, int
            numberPerLine) {
        int count = 0;
        for (int i = ch1; i <= ch2; i++) {
            System.out.print((char)i + " ");
            count++;

            if (count == numberPerLine) {
                System.out.println();
                count = 0;
            }
        }
    }
}
