package Poglavlje3;

import java.util.Scanner;

public class CostOfShipping3_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite tezinu paketa : ");
        double tezina = input.nextDouble();

        if (tezina > 50) {
            System.out.println("Paket ne moze biti poslat. ");
        }
        else {
            double cjena;
            if (tezina <= 1)
                cjena = 3.5;
            else if (tezina <= 3)
                cjena = 5.5;
            else if (tezina <= 10)
                cjena = 8.5;
            else
                cjena = 10.5;
            System.out.println("Cijena paketa je : " + (cjena * tezina) + "$");
        }
    }
}
