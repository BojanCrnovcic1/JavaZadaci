package Poglavlje2;

import java.util.Scanner;

public class CurrentTime2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite vremensku zonu po GMT : ");
        int vremenskaZona = input.nextInt();

        long milisekunde = System.currentTimeMillis();

        int sekundTotal = (int) (milisekunde / 1000);
        int sekund = sekundTotal % 60;
        int minutTotal = sekundTotal / 60;
        int minut = minutTotal % 60;
        int satTotal = minutTotal / 60;
        int sat = satTotal % 24;

        sat = sat + vremenskaZona;


        System.out.println("Tacno vrijeme : "+sat+":"+minut+":"+sekund);
    }
}
