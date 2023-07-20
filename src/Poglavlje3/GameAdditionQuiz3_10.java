package Poglavlje3;

import java.util.Scanner;

public class GameAdditionQuiz3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int prviBroj = (int) (Math.random() * 100);
        int drugiBroj = (int) (Math.random() * 100);

        int broj1 = (prviBroj<drugiBroj)?drugiBroj:prviBroj;
        int broj2 = (drugiBroj>prviBroj)?prviBroj:drugiBroj;

        System.out.println("Koliko je "+broj1+" - "+broj2+" ? ");
        int odgovor = input.nextInt();

        if (broj1-broj2 == odgovor) {
            System.out.println(odgovor + " je tacan rezultat. ");
        }else
            System.out.println("Netacan rezultat. Tacan rezultat je "+(broj1-broj2));
    }
}
