package Poglavlje3;

import java.util.Scanner;

public class GameAddThreeNumbers3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int broj1 = (int) (Math.random() * 10);
        int broj2 = (int) (Math.random() * 10);
        int broj3 = (int) (Math.random() * 10);

        System.out.println("Koliko je "+broj1+" + "+broj2+" + "+broj3+" ?");
        int odgovor = input.nextInt();

        if (broj1+broj2+broj3 == odgovor) {
            System.out.println(odgovor + " je tacan rezultat!");
        }else
            System.out.println("Netacan rezultat. Tacan rezultat je "+(broj1+broj2+broj3));
    }
}
