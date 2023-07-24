package Poglavlje5;

import java.util.Scanner;

public class CountUppercaseLetters5_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int velikoSlovo = 0;

        System.out.println("Unesite neki string : ");
        String string = input.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                velikoSlovo++;
            }
        }
        System.out.println("Broj velikih slova u stringu je : " + velikoSlovo);
    }
}
