package Poglavlje5;

import java.util.Scanner;

public class RepeatAdditions5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int BROJ_PITANJA = 10;
        int count = 0;
        int countTacno = 0;
        String ispis = "";
        long startTime = System.currentTimeMillis();

        while (count < BROJ_PITANJA) {

            int broj1 = (int) (Math.random() * 15);
            int broj2 = (int) (Math.random() * 15);

            System.out.println("Koliko je " + broj1 + " + " + broj2 + " ? ");
            int odgovor = input.nextInt();

            if (broj1 + broj2 == odgovor) {
                System.out.println("Tacan odgovor. ");
                countTacno++;
            }
            else
                System.out.println("Netacan odgovor. Resenje je : " + (broj1 + broj2));
            count++;

            ispis += "\n" + broj1 + " + " + broj2 + " = " + odgovor +
                    ((broj1 + broj2 == odgovor) ? " tacno":" netacno");
        }
        long endTime = System.currentTimeMillis();

        long testTime = endTime - startTime;

        System.out.println("Tacnih odgovora je : " + countTacno + "" +
                "\nTestno vrijeme je : " + (testTime / 1000) + " sekundi " + ispis);
    }
}
