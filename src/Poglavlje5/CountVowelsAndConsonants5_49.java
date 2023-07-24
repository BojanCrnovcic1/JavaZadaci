package Poglavlje5;

import java.util.Scanner;

public class CountVowelsAndConsonants5_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int samoglanici = 0;
        int suglasinici = 0;

        System.out.println("Unesite neki string :");
        String string = input.nextLine();

        for (int i = 0; i < string.length(); i++) {
            char st = string.charAt(i);
            if (Character.isLetter(st)) {
                String str = st + "";
                if ("aeiou".contains(str.toLowerCase())) {
                    samoglanici++;
                }else
                    suglasinici++;
            }
        }
        System.out.println("String sadrzi " + samoglanici +
                " samoglasnika i " + suglasinici + " suglasnika.");
    }
}
