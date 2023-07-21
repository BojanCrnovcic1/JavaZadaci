package Poglavlje4;

import java.util.Scanner;

public class VowelOrConsonant4_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite slovo : ");
        String slovoS = input.next();
        char slo = slovoS.charAt(0);

        if (Character.isLetter(slo)) {
            String slovo = slo + "";
            if ("aeiou".contains(slovo.toLowerCase())) {
                System.out.println(slo + " je samoglasnik. ");
            }
            else {
                System.out.println(slo + " je suglasnik. ");
            }
        }
        else
            System.out.println(slo + " je pogresan simbol. ");
    }
}
