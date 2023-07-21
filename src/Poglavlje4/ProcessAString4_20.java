package Poglavlje4;

import java.util.Scanner;

public class ProcessAString4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite string : ");
        String string = input.nextLine();

        System.out.println("Duzina stringa je : " + string.length() +"" +
                "\nKarakter na prvom indexu je : " + string.charAt(0));
    }
}
